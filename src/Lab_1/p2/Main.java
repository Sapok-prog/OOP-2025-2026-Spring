package Lab_1.p2;

public class Main {
    public static void main(String[] args) {
        CoffeeOrder.printShopInfo();

        CoffeeOrder order1 = new CoffeeOrder(1);
        order1.addExtraShot();
        System.out.println("Order " + order1.getOrderId() + " (" + order1.getSize() + ") price: " + order1.getPrice());

        CoffeeOrder order2 = new CoffeeOrder(2, CoffeeOrder.Size.LARGE);
        order2.addExtraShot(0.75);
        System.out.println("Order " + order2.getOrderId() + " (" + order2.getSize() + ") price: " + order2.getPrice());

        CoffeeOrder.printShopInfo();
    }
}
