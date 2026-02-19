package Lab_1.p2;

public class CoffeeOrder {

    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    public static int totalOrders = 0;
    public static final String SHOP_NAME = "JavaBean Cafe";


    private final int orderId;
    private final Size size;
    private double price;


    {
        totalOrders++;

    }


    public CoffeeOrder(int orderId) {
        this(orderId, Size.MEDIUM);
    }


    public CoffeeOrder(int orderId, Size size) {
        this.orderId = orderId;
        this.size = size;
        this.price = PriceFor(size);
    }


    public int getOrderId() {
        return orderId;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void addExtraShot() {
        addExtraShot(0.50);
    }

    public void addExtraShot(double shotPrice) {
        this.price += shotPrice;
    }

    private double PriceFor(Size size) {
        switch (size) {
            case SMALL: return 2.50;
            case MEDIUM: return 3.00;
            case LARGE: return 3.50;
            default: return 3.00;
        }
    }


    public static void printShopInfo() {
        System.out.println("Welcome to " + SHOP_NAME);
        System.out.println("Total orders so far: " + totalOrders);
    }

}

