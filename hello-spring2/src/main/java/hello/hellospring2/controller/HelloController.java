package hello.hellospring2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String helloStatic(Model model) {
		model.addAttribute("data","Spring!!");
		return ("hello");
	}
	
	@GetMapping("hello-mvc")
	public String helloMvc(@RequestParam(value = "name") String name, Model model) {
		model.addAttribute("name",name);
		return "hello-template";
	}
	
	@GetMapping("hello-string")
	@ResponseBody //응답 바디부에 값(hello $name)을 그대로 넘김
	public String helloString(@RequestParam("name") String name) {
		
		return "hello" + name;
	}
	
	@GetMapping("hello-api")
	@ResponseBody
	public Hello hellpApi(@RequestParam ("name") String name) {
		Hello hello = new Hello();
		hello.setName(name);
		return hello; // 객체를 반환함. -> Json 형태로 반환됨
	}
	
	static class Hello{
		private String name;
	
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
	}
}
