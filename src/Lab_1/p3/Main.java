package Lab_1.p3;


public class Main {

    public static void main(String[] args){

        Temperature temperature = new Temperature();
        temperature.degreesF();
        System.out.println(temperature.getScale());
        temperature.degreesC();
        System.out.println(temperature.getScale());

        Temperature temperature1 = new Temperature(5 , "F");
        temperature1.degreesC();
        System.out.println(temperature1.getScale());

        Temperature temperature2 = new Temperature(-15 , "C");
        temperature2.degreesF();
        System.out.println(temperature2.getScale());
    }

}
