package practice_3;
import java.util.Vector;
import java.util.Scanner;

public class p2Test {

    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        Vector<Person> users = new Vector<>();
        while (true) {
            int choice;
            System.out.println("\n=== MENU ===");
            System.out.println("1. Show all people");
            System.out.println("2. Add Person");
            System.out.println("3. Add Student");
            System.out.println("4. Add Staff");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            choice = console.nextInt();
            console.nextLine();

            if (choice == 1) {
                if (users.isEmpty()) {
                    System.out.println("No people added yet.");
                } else {
                    System.out.println("\n=== ALL PEOPLE ===");
                    for (Person user : users) {
                        System.out.println(user.toString());
                    }
                }
            } else if (choice == 2) {
                System.out.print("Enter name: ");
                String name = console.nextLine();
                System.out.print("Enter address: ");
                String address = console.nextLine();
                users.add(new Person(name, address));
                System.out.println("Person added successfully!");
            } else if (choice == 3) {
                System.out.print("Enter name: ");
                String sName = console.nextLine();
                System.out.print("Enter address: ");
                String sAddress = console.nextLine();
                System.out.print("Enter program: ");
                String program = console.nextLine();
                System.out.print("Enter year: ");
                int year = console.nextInt();
                System.out.print("Enter fee: ");
                double fee = console.nextDouble();
                console.nextLine();
                users.add(new Student(sName, sAddress, program, year, fee));
                System.out.println("Student added successfully!");
            } else if (choice == 4) {
                System.out.print("Enter name: ");
                String stName = console.nextLine();
                System.out.print("Enter address: ");
                String stAddress = console.nextLine();
                System.out.print("Enter school: ");
                String school = console.nextLine();
                System.out.print("Enter pay: ");
                double pay = console.nextDouble();
                console.nextLine();
                users.add(new Staff(stName, stAddress, school, pay));
                System.out.println("Staff added successfully!");
            } else if (choice == 5) {
                System.out.println("Exiting...");
                console.close();
                return;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }

    }

}
