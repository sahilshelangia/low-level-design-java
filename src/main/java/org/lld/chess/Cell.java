package org.lld.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.lld.chess.piece.Piece;

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
