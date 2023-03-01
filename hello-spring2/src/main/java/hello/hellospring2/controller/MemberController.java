package hello.hellospring2.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import hello.hellospring2.domain.Member;
import hello.hellospring2.repository.MemberRepository;
import hello.hellospring2.service.MemberService;

@Controller
public class MemberController {

	private final MemberService memberService;
	
	@Autowired
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@GetMapping("/members/new")
	public String createForm() {
		return "members/createMemberForm";
	}
	
	@PostConstruct("/members/new")
	public String create(memberForm form) {
		Member member = new Member();
		member.setName(form.getName());
		
		memberService.join(member);
		
		return "redirect:/";
	}
	

}
