package design.problems.tictactoe;

import java.util.*;

public class Game {
    private final UUID uuid;
    private final Board board;

    // Could have done with queue, but for undo we need Deque.
    private final Deque<Player> players;
    private final Stack<Move>movesHistory;
    private static final Scanner SCANNER = new Scanner(System.in);


    public Game(int boardSize, List<User> users) {
        this.uuid = UUID.randomUUID();
        this.board = new Board(boardSize);
        this.players = new ArrayDeque<>();
        this.movesHistory = new Stack<>();

        // assign piece-type to each user.
        for (int i = 0; i < users.size(); ++i) {
            players.add(new Player(users.get(i), new PieceType(i + 1)));
        }
    }

    /**
     * This function is responsible for keeping the game state and let the player make chance accordingly and decided
     * the winner. Time complexity of each operation is as follows.
     * player making a move- O(1)
     * deciding whether game is over after each step is also O(1)
     *
     * @return the winner of the game. if it's a draw. it will return null.
     */
    public User start() {
        int totalMoves = board.getSize() * board.getSize();
        while (totalMoves != 0) {
            // pick the player, whose chance it is.
            Player turn = players.pop();

            // let the player know about their chance.
            System.out.printf("%s it's your chance. place %d on the board\n", turn.getName(), turn.getPieceType().getValue());
            this.board.print();

            // take user input in form of x,y coordinate with zero based indexing.
            while (true) {
                int x = SCANNER.nextInt();
                int y = SCANNER.nextInt();
                try {
                    if (board.move(new Move(x, y, turn))) {
                        turn.getUser().incrementWins();
                        return turn.getUser();
                    }
                    movesHistory.push(new Move(x, y, turn));
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid move. " + e.getMessage() + "\n Try again !");
                }
            }

            System.out.println("Do you want to do it?");
            if (SCANNER.next().equals("yes")) {
                // undo logic here.
                // if it's undo put the same player in front of the queue.
                players.addFirst(turn);

                // find the last move and remove the piece from that cell.
                this.board.undoMove(movesHistory.get(movesHistory.size() - 1));
                this.movesHistory.pop();
                continue;
            }
            players.add(turn);
            totalMoves = totalMoves - 1;
        }
        return null;
    }
}
