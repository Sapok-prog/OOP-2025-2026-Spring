package Lab_2.p2;

public abstract class Piece {

    private Position a;
    public int[][] board = new int[8][8];

    public Piece(Position a){
        this.a = a;
        board[a.getY()][a.getX()] = 1;
    }

    public abstract boolean isLegalMove(Position b);

}
