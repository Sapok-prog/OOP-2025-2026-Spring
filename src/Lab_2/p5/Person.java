package Lab_2.p5;

public abstract class Person {

    private String name;
    private int age;
    private Animal pet;

    public Person(String name , int age){
        this.name = name;
        this.age = age;
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

    public void assignPet(Animal pet){
        this.pet = pet;
    }

    public Animal getPet() {
        return pet;
    }

    public void removePet(){
        pet = null;
    }

    public boolean hasPet(){
        return (pet == null);
    }

    public abstract String getOccupation();

    @Override
    public String toString(){
        return "Name : " + name +
                "\nAge : " + age +
                "\nPet info\n" + pet;
    }

    @Override
    public boolean equals(Object o){

        if(this == o){
            return true;
        }

        Person toCompare = (Person) o;
        return (toCompare.getName().equals(getName()) && toCompare.getAge() == getAge() && toCompare.pet.equals(pet));

    }

    public void leavePetWith(Person person){

        person.assignPet(pet);
        removePet();

    }

    public void retrievePetFrom(Person person){

        assignPet(person.getPet());
        person.removePet();

    }

}
