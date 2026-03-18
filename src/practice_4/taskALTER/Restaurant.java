package practice_4.taskALTER;

public class Restaurant {

    boolean servePizza(CanHavePizza eater , CanHavePizza.PIZZASIZE pizzasize){
        eater.eatPizza(pizzasize);
        if(eater instanceof Person){

            Person student = (Person) eater;
            int price = 0;

            switch(pizzasize){
                case SMALL :
                    price = 10;
                    break;
                case MEDIUM :
                    price = 20;
                    break;
                case LARGE :
                    price = 30;
                    break;
            }
            if(student.getBalance() < price){
                return false;
            }student.setBalance(student.getBalance() - price);
        }return true;
    }
}
