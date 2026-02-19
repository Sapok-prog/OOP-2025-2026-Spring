package Lab_1.p3;

public class Temperature {

    private double temperatureValue;
    private String scaleChar;


    public Temperature(double temperatureValue , String scaleChar){

        this.temperatureValue = temperatureValue;
        this.scaleChar = scaleChar;

    }

    public Temperature(double temperatureValue){

        this.temperatureValue = temperatureValue;
        this.scaleChar = "C";

    }

    public  Temperature(String scaleChar){

        this.temperatureValue = 0;
        this.scaleChar = scaleChar;

    }

    public Temperature(){

        temperatureValue = 0;
        scaleChar = "C";

    }

    public void degreesC(){

        if(scaleChar.equals("C")){
            return;
        }

        temperatureValue = 5 * (temperatureValue - 32) / 9;
        scaleChar = "C";

    }public void degreesF(){

        if(scaleChar.equals("F")){
            return;
        }

        temperatureValue = (9 * (temperatureValue / 5) + 32);
        scaleChar = "F";

    }

    public void setTemperatureValue(double temperatureValue){

        this.temperatureValue = temperatureValue;

    }

    public void setScaleChar(String scaleChar){

        this.scaleChar = scaleChar;

    }

    public String getScale(){

        return temperatureValue + scaleChar;

    }

}
