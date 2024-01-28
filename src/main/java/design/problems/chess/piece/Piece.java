package design.problems.chess.piece;

import design.problems.chess.Color;
import design.problems.chess.Coordinate;
import lombok.Getter;
import lombok.Setter;
import design.problems.chess.Move;

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
