package org.lld.chess.game;

import org.lld.chess.Cell;
import org.lld.chess.Coordinate;
import org.lld.chess.Move;
import org.lld.chess.piece.Piece;
import org.lld.chess.player.Player;

import java.util.Scanner;

public class GameController {
    Game game;
    Scanner scanner = new Scanner(System.in);

    public Player start(Player playerA, Player playerB) {
        game = new Game(playerA, playerB);

        while (true) {
            Player playerTurn = game.getPlayerTurn();
            game.getBoard().print();

            System.out.printf("It's %s turn, Enter start and end coordinates- \n", playerTurn.getName());
            Move move = getMoveInput();
            while (!isValidMove(move, playerTurn)) {
                System.out.println("It's  not valid move, try again !!!");
                move = getMoveInput();
            }
            movePiece(move);

            // if it's check, let the player know.
            if (isCheck()) {
                System.out.println("Alert: It's check.");
            }

            // if it's check-mate.
            if (isCheckMate()) {
                return playerTurn;
            }

            this.game.setPlayerTurn(getNextPlayerTurn());
        }
    }

    private Move getMoveInput() {
        int startX = scanner.nextInt(), startY = scanner.nextInt(), endX = scanner.nextInt(), endY = scanner.nextInt();
        return new Move(new Coordinate(startX, startY), new Coordinate(endX, endY));
    }

    private boolean isValidMove(Move move, Player playerTurn) {
        // add null pointers.
        Cell cell = game.getBoard().getCell(move.getStart());
        if (cell == null) {
            System.out.println("Invalid coordinates !!!");
            return false;
        }

        Piece pieceToMove = cell.getPiece();
        if (pieceToMove == null) {
            System.out.println("No piece is present at given start coordinates !!!");
            return false;
        }

        // piece must belong to same player.
        if (!pieceToMove.getColor().equals(playerTurn.getColor())) {
            System.out.printf("Piece at start location doesn't belongs to %s%n", playerTurn.getName());
            return false;
        }

        // todo: if destination have the piece, it must belong to other player.



        // piece.isValid()
        return pieceToMove.isValidMove(move);
    }


    // responsibility is to move the piece.
    private void movePiece(Move move) {
        // 1. Find the piece that needs to be moved.
        // 2. Make the current cell empty.
        // 3. If any piece is present on destination cell, mark that as killed.
        // 4. Move the piece.
        Piece pieceToMove = game.getBoard().getCell(move.getStart()).getPiece();
        game.getBoard().setCell(move.getStart(), null);

        if (game.getBoard().getCell(move.getEnd()).getPiece() != null) {
            game.getBoard().getCell(move.getStart()).getPiece().setKilled(true);
        }

        game.getBoard().setCell(move.getStart(), pieceToMove);
    }

    private Player getNextPlayerTurn() {
        if (game.getFirstPlayer() == game.getPlayerTurn()) {
            return game.getSecondPlayer();
        }
        return game.getFirstPlayer();
    }


    // return true/false depending on the state of game.
    private boolean isCheckMate() {
        // todo: later
        return false;
    }

    private Player getWinner() {
        return null;
    }

    // return true/false depending on the state of game.
    private boolean isCheck() {
        return false;
    }

}
