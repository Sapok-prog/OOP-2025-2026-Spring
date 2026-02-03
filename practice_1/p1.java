package practice_1;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String name = console.nextLine();

        int len_of_name = name.length();
        System.out.print("+");
        for(int i = 0;i < len_of_name;i++){

            System.out.print("-");

        }System.out.println("+");

        System.out.println("|" + name + "|");
        System.out.print("+");
        for(int i = 0;i < len_of_name;i++){

            System.out.print("-");

        }
        System.out.println("+");

    }
}
