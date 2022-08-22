package chess;

import boardGame.Board;
import boardGame.Piece;

public abstract class ChessPiece extends Piece{
    
    private final Color color;

    public ChessPiece(Color color, Board board) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
