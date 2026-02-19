package practice_3;

public class Animal {

    private String gender;
    private int age;

    public Animal(){

        gender = "Female";
        age = 0;

    }public Animal(String gender){

        this.gender = gender;
        age = 0;

    }
    public Animal(int age){

        gender = "Female";
        this.age = age;

    }
    public Animal(String gender , int age){

        this.gender = gender;
        this.age = age;

    }

    public String getGender(){

        return gender;

    }

    public int getAge(){

        return age;

    }

    public void makeSound(){

        System.out.print("Sound! ");

    }

    public void eat() {
        System.out.print("Animal is eating ");
    }

    @Override
    public String toString() {

        return "gender : " + gender + "\n" +
                "age : " + age + "\n";

    }
}
