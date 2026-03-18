package practice_4.task2;

public class Plane extends FlyableThings implements CanFly{

    private String name;
    private int creationYear;
    private String company;

    public Plane(String name , int creationYear , String company , int speed , int flyHeight){
        super(speed , flyHeight);
        this.name = name;
        this.creationYear = creationYear;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public void fly() {
        System.out.println("✈️✈️✈️");
    }

    @Override
    public String toString(){
        return "name: " + name + ", creationYear: " + creationYear +
                ", company: " + company +
                super.toString();
    }
}
