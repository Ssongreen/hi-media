package himedia.second.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import himedia.second.domain.Member;
import himedia.second.repository.MemberRepository;
import himedia.second.repository.MemoryMemberRepository;

@Service
public class MemberService {
	//첫번째 방법
//	private final MemoryMemberRepository repository = new MemoryMemberRepository();
	

	//두번째 방법
	//생성자를 통한 DI(의존성 주입)
	private final MemberRepository repository;
	@Autowired
	public MemberService(MemberRepository repository) {
		System.out.println("MemberService 실행");
		this.repository = repository;
	}

	/**
	 *  회원가입
	 */
		public Long join(Member member) {
			repository.save(member);
			return member.getId();
		}
		/**
		 * 아이디 검색 (조회)
		 * 
		 */
		public Optional<Member> findId(Long memberId) {
			return repository.findById(memberId);
		}
	
		/**
		 * 이름 으로 검색
		 * @param memberName
		 * @return
		 */
		public Optional<Member> findName(String memberName) {
			return repository.findByName(memberName);
		}
		/**
		 * 전체 데이터 검색(조회)
		 * 
		 */
		public List<Member> findMember(){
			return repository.findAll();
		}
		
		
		
		
}
