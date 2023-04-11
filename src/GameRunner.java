public class GameRunner {

	public static void main(String[] args) {
//		MarioGame game = new MarioGame();
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
