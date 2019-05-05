package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() { //somente classes e subclasses do pacote podem acessar. Protecao do sistema
		return board;
	}

}
