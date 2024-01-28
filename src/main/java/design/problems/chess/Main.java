package design.problems.chess;

import design.problems.chess.game.GameController;
import design.problems.chess.player.Player;

public class Main {
    public static void main(String[] args) {
        // initialize game controller.

        // initialize players.
        Player playerA = new Player("Sahil", Color.WHITE);
        Player playerB = new Player("Sanjit", Color.BLACK);


        // initialize game
        GameController gameController = new GameController();
        Player winner = gameController.start(playerA, playerB);
    }
}
