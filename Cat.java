package practice_3;

public class Cat extends Animal{

    private String color;
    private String name;

    public Cat(){
        super();
        color = "black";
        name = null;
    }

    public Cat(String color){
        super();
        this.color = color;
        name = null;
    }

    public Cat(String color , String name){
        super();
        this.color = color;
        this.name = name;
    }

    public Cat(String color , String name , String gender){
        super(gender);
        this.color = color;
        this.name = name;
    }

    public Cat(String color , String name , int age){
        super(age);
        this.color = color;
        this.name = name;
    }

    public Cat(String color , String name , String gender , int age){
        super(gender, age);
        this.color = color;
        this.name = name;
    }

    public String getName(){

        return name;

    }

    public String getColor(){

        return color;

    }

    public void getHiss(){

        System.out.println("hissss");

    }

    public void eat(int foodAmount) {

        super.eat();
        System.out.println(foodAmount + " grams of food");

    }

    public void eat(String food){

        super.eat();
        System.out.println(food);

    }

    @Override
    public void makeSound(){

        System.out.println("Meow");

    }

    @Override
    public String toString(){

        return "gender : " + getGender() + "\n" +
                "age : " + getAge() + "\n"+
                "color : " + getColor() + "\n" +
                "name : " + getName();

    }

}
