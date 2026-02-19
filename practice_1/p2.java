package practice_1;
import java.util.Scanner;

public class p2 {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        int side_a = console.nextInt();

        int area = side_a * side_a;
        int perimeter = 4*side_a;
        double diagonal = Math.sqrt(side_a*side_a + side_a*side_a);

        System.out.println("Area : " + area);
        System.out.println("Perimeter : " + perimeter);
        System.out.println("Diagonal : " + diagonal);

    }
}
