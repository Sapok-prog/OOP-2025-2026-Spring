package practice_4.taskALTER;

public class TestPizza {
    public static void main(String[] args){

        Student amigos = new Student("Amigos" , 18 ,15 ,"SITE");
        Cat mursik = new Cat("Mursik" , 6 , "britain");

        if(amigos.haveRetake(60.0)){
            System.out.println("Yay");
        }else {
            System.out.println("Eh");
        }

        Restaurant delpapa = new Restaurant();

        System.out.println(amigos.getBalance());

        delpapa.servePizza(mursik , CanHavePizza.PIZZASIZE.LARGE);
        delpapa.servePizza(amigos , CanHavePizza.PIZZASIZE.SMALL);

        System.out.println(amigos.getBalance());
    }
}
