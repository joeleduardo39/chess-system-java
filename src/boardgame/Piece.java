package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // se n�o tivesse ja ficava null pois n retorna nada
	}

	protected Board getBoard() { //somente classes dentro msm pacote e subclasses que v�o poder acessar tabuleiro de pe�a
		return board;
	}

	//sem set board para n�o permitir ser alterado
	
	
	
	
}
