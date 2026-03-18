package practice_4.taskALTER;

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
    public void eatPizza(PIZZASIZE pizzasize) {
        System.out.println("Meow eating " + pizzasize + " size pizza ");
    }

    @Override
    public void makeSound(){
        System.out.println("Meow!");
    }
}
