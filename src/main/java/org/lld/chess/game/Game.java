package org.lld.chess.game;

import lombok.Getter;
import lombok.Setter;
import org.lld.chess.Board;
import org.lld.chess.player.Player;

@Getter
public class Game {
    private final Player firstPlayer;
    private final Player secondPlayer;

    @Setter
    private Player playerTurn;

    private Board board;

    public Game(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;

        // todo: randomize it later.
        playerTurn = firstPlayer;
        board = new Board(firstPlayer, secondPlayer);
    }
}
