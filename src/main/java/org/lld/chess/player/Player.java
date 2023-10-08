package org.lld.chess.player;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.lld.chess.Color;

@AllArgsConstructor
@Getter
public class Player {
    private String name;
    private Color color;
}
