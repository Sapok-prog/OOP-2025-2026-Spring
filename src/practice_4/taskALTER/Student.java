package practice_4.taskALTER;

public class Student extends Person implements CanHavePizza, CanHaveParty, CanHaveRetake, Movable {

    private String major;

    public Student(String name, int age , int balance , String major) {
        super(name, age , balance);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String dance() {
        return "Just dance";
    }

    @Override
    public void eatPizza(CanHavePizza.PIZZASIZE pizzasize) {
        System.out.println("Nyama eating " + pizzasize + " size pizza ");
    }

    @Override
    public boolean haveRetake(double score) {
        if(score <= 50){
            return true;
        }return false;
    }

    @Override
    public void move() {
        System.out.println("Moving and putting hands up!");
    }
}
