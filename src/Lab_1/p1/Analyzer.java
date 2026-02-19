package Lab_1.p1;

import java.util.Scanner;

public class Analyzer {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Data data = new Data();

        String userInput;

        while(true){

            System.out.print("Enter number(Q to quit): ");
            userInput = console.nextLine();

            if(userInput.equals("Q")){

                System.out.println("Average = " + data.getAverage());
                System.out.println("Maximum = " + data.getMaximum());
                return;

            }

            try{

                double numToAdd = Double.parseDouble(userInput);
                data.addValue(numToAdd);

            }catch (NumberFormatException e){

                System.out.println("That's not a number or Q. Try again!");

            }

        }
    }
}
