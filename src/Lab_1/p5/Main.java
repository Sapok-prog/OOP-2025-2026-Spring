package Lab_1.p5;

public class Main {

    public static void main(String[] args){

        Person person1 = new Person(Person.Gender.G);
        Person person2 = new Person(Person.Gender.B);
        Person person3 = new Person(Person.Gender.B);
        Person person4 = new Person(Person.Gender.G);

        DragonLaunch dragonLaunch = new DragonLaunch();

        dragonLaunch.kidnap(person1);
        dragonLaunch.kidnap(person2);
        dragonLaunch.kidnap(person3);
        dragonLaunch.kidnap(person4);

        if(dragonLaunch.willDragonEatOrNot() == 0){

            System.out.println("No he is hungry");

        }else{

            System.out.println("Yes he ate " + dragonLaunch.willDragonEatOrNot() + " people");

        }

    }

}
