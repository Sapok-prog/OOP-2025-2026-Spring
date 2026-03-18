package practice_4.taskALTER;

public class Person implements Movable {

    private String name;
    private int age;
    private int balance;

    public Person(String name , int age, int balance){
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void move() {
        System.out.println("Moving legs");
    }

    public void eat(){
        System.out.println("Eating food with hands");
    }
}
