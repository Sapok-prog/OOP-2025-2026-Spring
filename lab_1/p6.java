package lab_1;
import java.util.Scanner;

public class p6 {

    static boolean palindrome(String word){

        StringBuilder reverse = new StringBuilder();
        for(int i = word.length() - 1;i != -1 ;i--){

            reverse.append(word.charAt(i));

        }

        if(reverse.toString().equals(word)){
            return true;
        }return false;
    }

    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        String word = console.nextLine();

        if(palindrome(word)){
            System.out.println(word + " is palindrome");
        }else {
            System.out.println(word + " is not palindrome");
        }

    }
}
