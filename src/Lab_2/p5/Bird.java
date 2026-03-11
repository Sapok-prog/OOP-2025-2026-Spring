package Lab_2.p5;

public class Bird extends Animal{

    public Bird(String name , int age){
        super(name , age);
    }

    @Override
    void getSound() {
        System.out.println("Chirp chirp");
    }
}
