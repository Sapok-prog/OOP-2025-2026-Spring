package practice_4.task2;

public class FlyableThings{

    private int speed;
    private int flyHeight;

    public FlyableThings(int speed , int flyHeight){
        this.speed = speed;
        this.flyHeight = flyHeight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFlyHeight() {
        return flyHeight;
    }

    public void setFlyHeight(int flyHeight) {
        this.flyHeight = flyHeight;
    }

    @Override
    public String toString(){
        return ", speed: " + speed +
                ", flyHeight: " + flyHeight;
    }
}
