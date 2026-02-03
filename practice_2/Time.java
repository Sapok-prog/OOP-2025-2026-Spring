package practice_2;

public class Time {

    protected int hour;
    protected int minute;
    protected int second;

    private void normalize() {
        if (second >= 60) {
            minute += second / 60;
            second %= 60;
        }
        if (minute >= 60) {
            hour += minute / 60;
            minute %= 60;
        }
        if (hour >= 24) {
            hour %= 24;
        }
    }

    private String timeToStandard(int hour , int minute , int second){

        StringBuilder result = new StringBuilder();

        if(hour / 10 == 0){
            result.append("0"+hour+":");
        }else{
            result.append(hour+":");
        }

        if(minute / 10 == 0){
                result.append("0"+minute+":");
        }else{
            result.append(minute+":");
        }

        if(second / 10 == 0){
            result.append("0"+second);
        }else{
            result.append(second);
        }
        return result.toString();

    }

    public Time(int hour, int minute ,int second){

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public String toUniversal(){

        int resultHour = hour;
        int resultMinute = minute;
        int resultSecond = second;

        if(resultSecond > 59){
            resultSecond = 0;
            resultMinute++;
        }
        if(resultMinute > 59){
            resultMinute = 0;
            resultHour++;
        }
        if(resultHour > 23){
            resultHour = 0;
        }
        return timeToStandard(resultHour , resultMinute , resultSecond);
    }

    public String toStandard(){

        boolean isNight = false;

        int resultHour = hour;
        int resultMinute = minute;
        int resultSecond = second;

        if(resultSecond > 59) {
            resultSecond = 0;
            resultMinute++;
        }

        if(resultMinute > 59){
            resultMinute = 0;
            resultHour++;
        }

        if(resultHour > 11){

            if(resultHour == 12){
                isNight = true;
            }
            else if(resultHour < 23){
                isNight = true;
                resultHour -= 12;
            }
        }

        if(isNight){
            return timeToStandard(resultHour , resultMinute , resultSecond)+ " PM";
        }
        return timeToStandard(resultHour , resultMinute , resultSecond)+ " AM";
    }


    public void add(Time sagat){

        this.hour += sagat.hour;
        this.minute += sagat.minute;
        this.second += sagat.second;
        normalize();

    }

}
