package com.examples;

public class GameRunner {

	public static void main(String[] args) {
//		com.examples.MarioGame game = new com.examples.MarioGame();
		GamingConsole marioGame = new MarioGame();
		GamingConsole chessGame = new ChessGame();

		marioGame.up();
		marioGame.down();

		chessGame.up();
		chessGame.down();
		chessGame.left();
		chessGame.right();

	}

}
