package Lab_2.p5;

public class Dog extends Animal{

    public Dog(String name , int age){
        super(name , age);
    }

    @Override
    void getSound() {
        System.out.println("Bark Bark");
    }

}
