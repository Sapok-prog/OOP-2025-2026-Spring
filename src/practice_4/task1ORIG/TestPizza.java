package practice_4.task1ORIG;

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

        delpapa.servePizza(mursik);
        if(!delpapa.servePizza(amigos)){
            System.out.println("Give away pizza student!");
        }
        System.out.println(amigos.getBalance());
    }
}
