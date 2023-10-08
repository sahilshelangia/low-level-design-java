package org.lld.chess.piece;

import org.lld.chess.Color;
import org.lld.chess.Coordinate;
import org.lld.chess.Move;

public class King extends Piece{
    public King(Color color, Coordinate initialCoordinate) {
        super(color, initialCoordinate);
    }

    @Override
    public boolean isValidMove(Move move) {
        return false;
    }

    @Override
    public PieceType getPieceType() {
        return PieceType.KING;
    }
}
