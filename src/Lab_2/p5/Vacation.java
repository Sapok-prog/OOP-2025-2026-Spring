package Lab_2.p5;

public class Vacation {

    public static void main(String[] args){

        Employee john = new Employee("John", 30, "Engineer");
        PhDStudent alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");
        Cat murka = new Cat("Murka", 5);
        john.assignPet(murka); // John owns Rex
        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        // John goes on vacation and leaves Rex with Alice
        john.leavePetWith(alice);
        // Registry reflects that Alice is taking care of Rex
        System.out.println(registry);
        // John returns from vacation and retrieves Rex
        john.retrievePetFrom(alice);
        // Registry reflects that John has his dog back
        System.out.println(registry);

    }

}
