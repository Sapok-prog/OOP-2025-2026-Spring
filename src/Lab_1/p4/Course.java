package Lab_1.p4;
import java.util.Set;

public class Course {

    private final String name;
    private String description;
    private int credits;
    private Set<Course> prerequisite;

    public Course(String name , String description , int credits){

        this.name = name;
        this.description = description;
        this.credits = credits;

    }

    public Course(String name , String description , int credits , Set<Course> prerequisite){

        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisite = prerequisite;

    }

    public String getName(){

        return name;

    }

    public String getDescription(){

        return description;

    }


    public String toString() {
        return name + " " + description;
    }


}
