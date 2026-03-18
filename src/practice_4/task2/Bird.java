package practice_4.task2;

public class Bird extends FlyableThings implements CanMakeASoundAndFly{

    private String name;
    private int age;
    private String species;

    public Bird(String name , int age , String species , int speed , int flyHeight){
        super(speed , flyHeight);
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void fly() {
        System.out.println("🦅🦅🦅");
    }

    @Override
    public void makeASound(){
        System.out.println("Chirp chirp");
    }

    @Override
    public String toString() {
        return "name: " + name + ", age: " + age + ", species: " + species + super.toString();
    }
}
