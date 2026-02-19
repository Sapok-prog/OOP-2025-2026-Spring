package Lab_1.p5;

public class Person {

    public enum Gender{

        B,
        G

    }

    private Gender gender;
    private String name;

    public Person(Gender gender){

        this.gender = gender;

    }

    public Person(Gender gender, String name){

        this.gender = gender;
        this.name = name;

    }

    public Gender getGender(){

        return gender;

    }
}
