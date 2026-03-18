package practice_4.task1ORIG;

public class Restaurant {

    private int price = 20;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    boolean servePizza(CanHavePizza eater){
        eater.eatPizza();
        if(eater instanceof Person){

            Person student = (Person) eater;
            if(student.getBalance() < price){
                return false;
            }student.setBalance(student.getBalance() - price);
        }return true;
    }
}
