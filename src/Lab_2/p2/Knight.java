package Lab_2.p2;

public class Knight extends Piece{

    public Knight(Position a){
        super(a);
        int[][] moves = {
                {-2,-1}, {-2,1},
                {2,-1}, {2,1},
                {1,2}, {-1,2},
                {1,-2}, {-1,-2}
        };

        for(int[] m : moves){
            int newY = a.getY() + m[0];
            int newX = a.getX() + m[1];

            if(newY >= 0 && newY < 8 && newX >= 0 && newX < 8){
                board[newY][newX] = 1;
            }
        }

    }

    @Override
    public boolean isLegalMove(Position b) {
        return board[b.getY()][b.getX()] == 1;
    }
}
