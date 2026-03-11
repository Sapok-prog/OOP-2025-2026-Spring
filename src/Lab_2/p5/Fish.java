package Lab_2.p5;

public class Fish extends Animal{

    public Fish(String name , int age){
        super(name , age);
    }

    @Override
    void getSound() {
        System.out.println("thump thump");
    }
}
