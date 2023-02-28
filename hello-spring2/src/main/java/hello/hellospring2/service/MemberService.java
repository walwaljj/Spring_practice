package hello.hellospring2.service;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;

import hello.hellospring2.domain.Member;
import hello.hellospring2.repository.MemberRepository;
import hello.hellospring2.repository.MemoryMemberRepository;

public class MemberService {
	
	private final MemberRepository memberRepository = new MemoryMemberRepository();
	
	
	public Long join(Member member) {
		
		validateDuplicateMember(member);//중복최원 검증
		
		memberRepository.save(member);
		return member.getId();
		
	}

	//중복회원 검증 로직
	private void validateDuplicateMember(Member member) {
		memberRepository.findByName(member.getName())
		.ifPresent(m -> {throw new IllegalStateException("이미 존재하는 회원입니다.");});
	}
	
	
	public List<Member> findMembers(){
		
		return memberRepository.findAll();
	}
	
	public Optional<Member> findOne(Long memberId){
		return memberRepository.findById(memberId);
	}
}
