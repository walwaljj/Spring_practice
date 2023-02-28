package hello.hellospring2.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hello.hellospring2.domain.Member;
import hello.hellospring2.repository.MemberRepository;
import hello.hellospring2.repository.MemoryMemberRepository;

public class MemberServiceTest {
	
	MemberService memberService;
	
	MemoryMemberRepository memberRepository;
	
	@BeforeEach
	public void beforeEach() { //테스트를 실행 하기전 먼저 실행됨(DI)
		memberRepository = new MemoryMemberRepository();
		memberService = new MemberService(memberRepository) ;
	}
	
	
	@AfterEach
	public void afterEach() {
		memberRepository.clearStore();
	}
	
	@Test
	void join() {
		Member member = new Member();
		member.setName("hellp");
		
		Long saveId = memberService.join(member);
		
		Member findMember = memberService.findOne(saveId).get();
		assertThat(member.getName()).isEqualTo(findMember.getName());
	}
	
	@Test
	void 중복_회원_예외() {
		
		Member member1 = new Member();
		member1.setName("Spring");

		Member member2 = new Member();
		member2.setName("Spring");
		
		memberService.join(member1);
		
		IllegalStateException assertThrows2 = assertThrows(IllegalStateException.class, 
				() -> memberService.join(member2)); // 해당 클레스의 예외가 발생할 때 join로직을 실행시킴.
		
		assertThat(assertThrows2.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
		
	}
	@Test
	void findMembers() {
		
	}
	
	@Test
	void findOne() {
		
	}
}
