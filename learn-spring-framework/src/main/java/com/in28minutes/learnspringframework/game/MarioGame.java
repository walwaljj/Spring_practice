package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component//스프링에 해당 클레스를 관리하라 지시.
public class MarioGame implements GamingConsole {//마우스 오른쪽 -> Refactor -> Extract Interface 
												// 인터페이스 이름 설정 (GamingConsole) 후 인터페이스에 추가할 메서드 선택하기.
												// 결과적으로 만든 인터페이스 자동 implements, @Override처리까지 해줌.
	
	@Override
	public void up() {
		System.out.println("jump");
	}
	
	
	@Override
	public void down() {
		System.out.println("go hole");
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
