package practice_4.taskALTER;

public interface CanHavePizza {
    enum PIZZASIZE{
        SMALL , MEDIUM , LARGE
    }
    void eatPizza(PIZZASIZE size);
}
