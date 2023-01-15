package com.in28minutes.learnspringframework.game;


//@Component
public class SuperContraGame implements GamingConsole{
	
	@Override
	public void up() {
		System.out.println("up");
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
