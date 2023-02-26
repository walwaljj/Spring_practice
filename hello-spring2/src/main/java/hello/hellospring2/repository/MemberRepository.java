package hello.hellospring2.repository;

import java.util.List;
import java.util.Optional;

import hello.hellospring2.domain.Member;

public interface MemberRepository {
	Member save(Member member);
	
	Optional<Member> findById(Long id);
	Optional<Member> findByName(Long name);
	
	List<Member> findAll();
	
	
	
}
