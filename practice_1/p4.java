package practice_1;
import java.util.Scanner;

public class p4 {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        if (a == 0) {
            System.out.println("a must not be 0 for the equation to be quadratic");
            return;
        }

        double D = (b * b) - (4 * a * c);
        if(D > 0){

            double x1 = ((-1) * b + Math.sqrt(D))/(2 * a);
            double x2 = ((-1) * b - Math.sqrt(D))/(2 * a);

            System.out.println(x1 + " " + x2);

        }else if(D == 0){

            double x = ((-1) * b) / (2 * a);
            System.out.println(x);

        }else{

            System.out.println("error");

        }

    }
}
