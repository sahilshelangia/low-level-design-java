package design.problems.tictactoe;

public class Player {
    private final User user;
    private final PieceType pieceType;

    public Player(User user, PieceType pieceType) {
        this.user = user;
        this.pieceType = pieceType;
    }

    public String getName() {
        return this.user.getName();
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public User getUser() {
        return user;
    }
}
