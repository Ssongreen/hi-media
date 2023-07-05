package himedia.second.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import himedia.second.domain.Member;

//@Primary
//@Repository
public class MemoryMemberRepository implements MemberRepository {

	private static Map<Long, Member> store = new HashMap<>();

	private static long sequence = 0L;

	@Override
	public Member save(Member member) {
		member.setId(++sequence);

		System.out.println("repository Id  :" + member.getId());

		store.put(member.getId(), member);
		return member;
	}

	@Override
	public Optional<Member> findById(Long id) {
		System.out.println("[memoryMemberRepository] 실행");
		return Optional.ofNullable(store.get(id));
	}

	@Override
	// 문제
	public Optional<Member> findByName(String name) {
		return store.values()
					.stream()
					.filter(member -> member.getName().equals(name))
					.findAny();
	}
//		for(Member m: store.values()) {
//			if(m.getName().equals(name);
//			return Optional.of(m);
//		}
//		return Optional.empty();
	
	

	@Override
	public List<Member> findAll() {
		return new ArrayList<>(store.values());
	}
}
