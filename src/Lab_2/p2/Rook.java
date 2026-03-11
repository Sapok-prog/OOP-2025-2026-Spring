package Lab_2.p2;

public class Rook extends Piece{

    public Rook(Position a){

        super(a);

        for(int i = 1;a.getY() - i >= 0;i++){
            board[a.getY() - i][a.getX()] = 1;
        }

        for(int i = 1;a.getX() - i >= 0;i++){
            board[a.getY()][a.getX() - i] = 1;
        }

        for(int i = 1;a.getY() + i < board.length;i++){
            board[a.getY() + i][a.getX()] = 1;
        }

        for(int i = 1;a.getX() + i < board.length;i++){
            board[a.getY()][a.getX() + i] = 1;
        }

    }

    @Override
    public boolean isLegalMove(Position b) {
        return board[b.getY()][b.getX()] == 1;
    }
}
