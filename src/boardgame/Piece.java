package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // se não tivesse ja ficava null pois n retorna nada
	}

	protected Board getBoard() { //somente classes dentro msm pacote e subclasses que vão poder acessar tabuleiro de peça
		return board;
	}

	//sem set board para não permitir ser alterado
	
	
	
	
}
