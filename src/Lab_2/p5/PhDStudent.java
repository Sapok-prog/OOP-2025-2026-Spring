package Lab_2.p5;

public class PhDStudent extends Person{

    private String major;
    private String research;

    public PhDStudent(String name , int age , String major , String research ){
        super(name , age);
        this.major = major;
        this.research = research;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getResearch() {
        return research;
    }

    public void setResearch(String research) {
        this.research = research;
    }

    @Override
    public String getOccupation() {
        return "Major : " + getMajor() +
                "\nResearch : " + getResearch();
    }
    @Override
    public void assignPet(Animal pet){
        if(pet.getName().equals("Dog")){
            return;
        }super.assignPet(pet);
    }
}
