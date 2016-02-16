package main;

/**
 * Created by Akarak on 15.02.2016.
 */
public class CarImpl  implements Car{
    private int speed = 100;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed + 12;
    }

    public void go() {
        System.out.println("Go at speed " + speed);

    }
}
