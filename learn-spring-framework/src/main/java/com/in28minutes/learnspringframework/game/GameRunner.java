package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
//필드 주입. 	runGame() 메소드, GamingConsole game 변수만 존재.
	@Autowired
	private GamingConsole game;
	
//생성자 주입.
	
	public GameRunner(GamingConsole game) {
		System.out.println("Using Constructor");
		this.game = game;
	}
	

//setter 주입.
//	@Autowired
//	public void setGame(GamingConsole game) {
//		System.out.println("Using setter");
//		this.game = game;
//	}


	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
