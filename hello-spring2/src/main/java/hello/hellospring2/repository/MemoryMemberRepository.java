package hello.hellospring2.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import hello.hellospring2.domain.Member;

public class MemoryMemberRepository implements MemberRepository{

	private static Map<Long,Member> store = new HashMap<>();
	
	private static long sequence = 0L;//실무에서는 동시성 문제로 atuomlong 사용

	
	@Override
	public Member save(Member member) {
		 member.setId(++sequence);
		 store.put(member.getId(), member);
		 return member;
	}

	@Override
	public Optional<Member> findById(Long id) {
		return Optional.ofNullable(store.get(id));//null 이 있을 경우를 위해 optional.ofnullable 을 사용.
	}

	@Override
	public Optional<Member> findByName(String name) {
		return store.values().stream().filter(member -> member.getName().equals(name)).findAny();
	}

	@Override
	public List<Member> findAll() {
		
		return new ArrayList<Member>(store.values());
	}
	
	public void clearStore() {
		store.clear();
	}
	
}
