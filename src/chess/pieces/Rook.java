package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);

	}

	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position (0,0);
		
		// above
		p.setValues(position.getRow() -1, position.getColumn());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() -1); //andando enquanto tiver peças vazias
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true; //testando se ainda tem uma casa livre e com uma peça adversária
		}
		
		
		
			// left
				p.setValues(position.getRow(), position.getColumn() - 1);
				while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
					mat[p.getRow()][p.getColumn()] = true;
					p.setColumn(p.getColumn() - 1); //andando enquanto tiver peças vazias pro lado esquerdo
				}
				if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					mat[p.getRow()][p.getColumn()] = true; //testando se ainda tem uma casa livre e com uma peça adversária
				}
		
		
			// right
				p.setValues(position.getRow(), position.getColumn() + 1);
				while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
					mat[p.getRow()][p.getColumn()] = true;
					p.setColumn(p.getColumn() + 1); //andando enquanto tiver peças vazias pro lado esquerdo
				}
				if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					mat[p.getRow()][p.getColumn()] = true; //testando se ainda tem uma casa livre e com uma peça adversária
				}
				
				// below
				p.setValues(position.getRow() +1, position.getColumn());
				while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
					mat[p.getRow()][p.getColumn()] = true;
					p.setRow(p.getRow() + 1); //andando enquanto tiver peças vazias
				}
				if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					mat[p.getRow()][p.getColumn()] = true; //testando se ainda tem uma casa livre e com uma peça adversária
				}
				
		
		
		
		return mat;
	}
}
