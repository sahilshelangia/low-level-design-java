package design.problems.chess.game;

import lombok.Getter;
import lombok.Setter;
import design.problems.chess.Board;
import design.problems.chess.player.Player;

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
