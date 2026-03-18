package practice_4.task1ORIG;

public class Cat extends Animal implements CanHavePizza {

    private String species;

    public Cat(String name, int age , String species) {
        super(name, age);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public void eatPizza() {
        System.out.println("Meow eating " + PIZZASIZE + " size pizza ");
    }

    @Override
    public void makeSound(){
        System.out.println("Meow!");
    }
}
