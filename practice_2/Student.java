package practice_2;

public class Student {

    protected String name;
    private final int id;
    private int yearOfStudy;

    public Student(String name , int id){

        this.name = name;
        this.id = id;

    }public String getName(){

        return this.name;

    }

    public int getId(){

        return this.id;

    }

    public String incrementYearOfStudy() {

        this.yearOfStudy++;
        return "year of study is successfully increased to " + yearOfStudy;

    }

}
