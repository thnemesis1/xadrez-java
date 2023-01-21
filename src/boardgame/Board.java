package boardgame;

public class Board {

	private int fileirasTabuleiro;
	private int colunasTabuleiro;
	private Piece[][] pieces;
	
	public Board(int fileirasTabuleiro, int colunasTabuleiro) {
		this.fileirasTabuleiro = fileirasTabuleiro;
		this.colunasTabuleiro = colunasTabuleiro;
		pieces = new Piece [fileirasTabuleiro][colunasTabuleiro];
	}

	public int getFileirasTabuleiro() {
		return fileirasTabuleiro;
	}

	public void setFileirasTabuleiro(int fileirasTabuleiro) {
		this.fileirasTabuleiro = fileirasTabuleiro;
	}

	public int getColunasTabuleiro() {
		return colunasTabuleiro;
	}

	public void setColunasTabuleiro(int colunasTabuleiro) {
		this.colunasTabuleiro = colunasTabuleiro;
	}
	
	
}
