package practice_1;
import java.util.Scanner;

public class p3 {

    static String rate(int grade) {

        if (grade <= 100 && grade >= 94.5) {
            return "A";
        } else if (grade < 94.5 && grade >= 89.5) {
            return "A-";
        } else if (grade < 89.5 && grade >= 84.5) {
            return "B+";
        } else if (grade < 84.5 && grade >= 79.5) {
            return "B";
        } else if (grade < 79.5 && grade >= 74.5) {
            return "B-";
        } else if (grade < 74.5 && grade >= 69.5) {
            return "B";
        } else if (grade < 69.5 && grade >= 64.5){
            return "C+";
        } else if (grade < 64.5 && grade >= 59.5){
            return "C";
        } else if (grade < 59.5 && grade >= 54.5){
            return "C-";
        } else if (grade < 54.5 && grade >= 49.5){
            return "D";
        } else {
            return "F";
        }


    }

    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        int grade = console.nextInt();

        System.out.println(rate(grade));

    }
}
