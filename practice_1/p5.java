package practice_1;
import java.util.Scanner;

public class p5 {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        System.out.println("enter balance you have:");
        double balance = console.nextDouble();

        System.out.println("enter interest you want:");
        double interest = console.nextDouble();

        System.out.println("choose operation :\n1 - check balance\n2 - top up your balance\n0 - exit");
        int operation = console.nextInt();

        while(operation != 0){
            switch (operation){
                case 0:
                    return;
                case 1:
                    balance *= interest;
                    System.out.println("Your current balance is : " + balance + "$");
                    break;
                case 2:
                    System.out.println("enter the amount of $ ");
                    double to_add = console.nextDouble();
                    balance = (balance + to_add) * interest;
                    System.out.println("Your current balance is : " + balance + "$");
                    break;
            }System.out.println();
            System.out.println("choose operation :\n1 - check balance\n2 - top up your balance\n0 - exit");
            operation = console.nextInt();

        }

    }
}
