package Lab_2.p2;

import java.security.PublicKey;

public class Queen extends Piece{

    public Queen(Position a){

        super(a);
        for(int i = 1; a.getY() - i >= 0 && a.getX()-i >= 0; i++){
            board[a.getY()-i][a.getX()-i] = 1;
        }

        for(int i = 1; a.getY() - i >= 0 && a.getX()+i < 8; i++){
            board[a.getY()-i][a.getX()+i] = 1;
        }

        for(int i = 1; a.getY() + i < 8 && a.getX()-i >= 0; i++){
            board[a.getY()+i][a.getX()-i] = 1;
        }

        for(int i = 1; a.getY() + i < 8 && a.getX()+i < 8; i++){
            board[a.getY()+i][a.getX()+i] = 1;
        }

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
