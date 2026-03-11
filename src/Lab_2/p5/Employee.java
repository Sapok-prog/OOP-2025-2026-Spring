package Lab_2.p5;

public class Employee extends Person{

    private String job;

    public Employee(String name , int age , String job){
        super(name , age);
        this.job = job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String getOccupation() {
        return "Job : " + job;
    }
}
