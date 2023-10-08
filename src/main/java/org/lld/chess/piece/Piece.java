package org.lld.chess.piece;

import lombok.Getter;
import lombok.Setter;
import org.lld.chess.Color;
import org.lld.chess.Coordinate;
import org.lld.chess.Move;

@Getter
public abstract class Piece {
    private final Color color;
    private final Coordinate initialCoordinate;
    @Setter
    private boolean isKilled;

    public Piece(Color color, Coordinate initialCoordinate) {
        this.color = color;
        this.initialCoordinate = initialCoordinate;
        isKilled = false;
    }

    public abstract boolean isValidMove(Move move);

    public abstract PieceType getPieceType();
}
