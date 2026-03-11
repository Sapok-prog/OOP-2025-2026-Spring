package Lab_2.p2;

public class Pawn extends Piece{

    public Pawn(Position a){

     super(a);
     board[a.getY() - 1][a.getX()] = 1;

    }

    @Override
    public boolean isLegalMove(Position b){

        return board[b.getY()][b.getX()] == 1;

    }
}
