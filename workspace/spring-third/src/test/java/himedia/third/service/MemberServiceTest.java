package himedia.third.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import himedia.third.domain.Member;
import himedia.third.repository.MemoryMemberRepository;

@SpringBootTest
class MemberServiceTest {

//	//[방법 1]
//	MemberService service = new MemberService(new MemoryMemberRepository());
	// [방법 2]
//	MemoryMemberRepository repository = new MemoryMemberRepository();
//	MemberService service = new MemberService(repository);

	// [방법 3]
	// 생성자를 이용한 DI(Dependency Injection) 자동 주입
	// filed 에서 DI 는 final를 사용 할 수 없어용

	// 한줄로 정리해용, 순서 상으로 repository -> service로 이어 진다.
	// 어노테이션은 같이 쓸 수 있게 하는게 아니라 개별적으로 사용 할 수 있게 해용
	
	@Autowired MemoryMemberRepository repository;
	
	@Autowired MemberService service;

	@AfterEach
	public void afterEach() {

		repository.clearStore();
	}

	@Test
	void 회원가입() {
		// given 어떤 데이터
		Member member = new Member();
		member.setName("샤샤샤");
		// when 무엇 = 회원 가입
		Long saveId = service.join(member);

		// then 검증 - id가 같은지 검증
		assertThat(saveId).isEqualTo(member.getId());

	}

	@Test
	void 아이디조회() {
		// given 어떤 데이터
		Member member = new Member();
		member.setName("두룹두룹");
		Long saveId = service.join(member);
		// when 무엇 = 아이디 조회
		Member searchMember = service.findId(saveId).get();

		// then 검증 id가 같은 검증
//		assertThat(searchMember).isEqualTo(member); 다른 검증
		assertThat(searchMember.getId()).isEqualTo(saveId);
	}

	@Test
	void 이름조회() {

		// given 어떤 데이터
		Member member = new Member();
		member.setName("빨간맛");
		service.join(member);
		// when 무엇 = 아이디 조회
		Member searchMember = service.findName(member.getName()).get();

		// then 검증
		assertThat(searchMember.getName()).isEqualTo(member.getName());
//		assertThat(searchMember.getName()).isEqualTo("셋"); 일부러 fail 함

	}

	@Test
	void 전체조회() {
		// given 어떤 데이터
		Member memberOne = new Member();
		memberOne.setName("하나");
		service.join(memberOne);
		Member membertwo = new Member();
		memberOne.setName("둘둘");
		service.join(membertwo);
		// when 무엇 = 저장 가입
		List<Member> searchMember = service.findMembers();
		// then 검증
		assertThat(searchMember.size()).isEqualTo(2);

	}

}
