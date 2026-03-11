package Lab_2.p5;

public class Cat extends Animal{

    public Cat(String name , int age){
        super(name , age);
    }

    @Override
    void getSound() {
        System.out.println("Meow meow");
    }

}
