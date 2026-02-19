package Lab_1.p1;

public class Data {
    private double max;
    private double sum;
    private int count;

    public Data(){
        max = Integer.MIN_VALUE * 1.0;
        sum = 0.0;
        count = 0;
    }

    public void addValue(double num){

        if(num > max){
            max = num;
        }

        sum += num;
        count++;

    }

    public double getAverage(){

        if(count == 0){
            return 0;
        }
        return sum / count;

    }

    public double getMaximum(){

        if(count == 0){
            return 0;
        }
        return max;

    }
}
