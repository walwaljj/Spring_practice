package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary// 하나이상의 매칭 컴포넌트(mario, SuperContra.. )가 컨트롤러에 등록되어 있다면 @Primary 어노테이션이 있는 클래스를 쓰세요 ..라고 하는 뜻.
public class PacManGame implements GamingConsole{
	
	@Override
	public void up() {
		System.out.println(" PacManGame up");
	}
	
	@Override
	public void down() {
		System.out.println("down");
	}
	
	@Override
	public void left() {
		System.out.println("left");
	}
	
	@Override
	public void right() {
		System.out.println("right");
	}
}
