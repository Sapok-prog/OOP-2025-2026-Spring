package Lab_2.p2;

public class King extends Piece{

    public King(Position a){

        super(a);
        board[a.getY() - 1][a.getX()] = 1;
        board[a.getY() + 1][a.getX()] = 1;
        board[a.getY()][a.getX() - 1] = 1;
        board[a.getY()][a.getX() + 1] = 1;

    }

    @Override
    public boolean isLegalMove(Position b) {
        return board[b.getY()][b.getX()] == 1;
    }

}


