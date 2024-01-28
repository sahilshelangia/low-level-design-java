package design.problems.chess;

import design.problems.chess.piece.Piece;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cell {
    private Piece piece;

    public boolean isFree() {
        return piece == null;
    }
}
