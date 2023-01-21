package boardgame;

public class Piece {

	protected Position posicao;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		posicao = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	
}
