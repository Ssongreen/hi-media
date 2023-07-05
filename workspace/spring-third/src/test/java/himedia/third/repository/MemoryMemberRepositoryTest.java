package himedia.third.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import himedia.third.domain.Member;

@SpringBootTest
public class MemoryMemberRepositoryTest {
	
	@Autowired
	MemoryMemberRepository repository; 
	
	@AfterEach
	public void afterEach() {
		repository.clearStore();
	}
	
	@Test
	public void 저장() {
		// given : 어떤 데이터
		Member member = new Member();
		member.setName("first");
		
		// when : 무엇 - 저장(가입)
		Member savedMember = repository.save(member);
		
		// then : 검증 - 가입한 사용자와 저장된 사용자 같은지 확인(주소)
		//assertThat(실제값).isEqualTo(예측값);	
		assertThat(savedMember).isEqualTo(member);		
		//assertThat(savedMember).isEqualTo(null);	// 일부러 failures 발생	
		//assertThat(savedMember).isEqualTo(new Member());		
	}
	
	@Test
	void findById() {
		// given : 어떤 데이터
		Member member = new Member();
		member.setName("둘");
		//Member savedMember = repository.save(member);
		repository.save(member);
		
		// when : 아이디 조회
		Member findMember = repository.findById(member.getId()).get();
		
		// then : 검증 
		//assertThat(findMember.getId()).isEqualTo(savedMember.getId());
		assertThat(findMember.getId()).isEqualTo(member.getId());		
	}
	
	@Test
	void findByName() {
		// given : 어떤 데이터
		Member member = new Member();
		member.setName("셋");
		repository.save(member);
		
		// when : 이름 조회
		Member findMember = repository.findByName(member.getName()).get();
		
		// then : 검증
		assertThat(findMember.getName()).isEqualTo(member.getName());	
	}
	
	@Test
	void 전체검색() {
		// given : 어떤 데이터
		Member member1 = new Member();
		member1.setName("one");
		repository.save(member1);
		
		Member member2 = new Member();
		member2.setName("two");
		repository.save(member2);
		
		// when : 전체 데이터 조회
		List<Member> result = repository.findAll();
		
		// then : 검증
		assertThat(result.size()).isEqualTo(2);		
	}

}




