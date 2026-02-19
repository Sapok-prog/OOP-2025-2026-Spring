package practice_3;

public class p1Test {

    public static void main(String[] args){

        Cat cat = new Cat("white" , "Kitty" , "boy" , 4);
        cat.eat();
        cat.eat("fish");
        cat.eat(5);

        System.out.println(cat.getColor());
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getGender());
        cat.getHiss();

        System.out.println(cat.toString());

    }

}
