package org.lld.chess;

import org.lld.chess.game.Game;
import org.lld.chess.game.GameController;
import org.lld.chess.player.Player;

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
