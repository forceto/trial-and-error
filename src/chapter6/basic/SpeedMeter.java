package chapter6.basic;

/**
 * Created by force_to on 2016/9/17.
 */
public abstract class SpeedMeter {
    private double turnRate;
    public SpeedMeter(){}

    public abstract double getRadius();

    public double getSpeed() {
        return Math.PI * 2 * getRadius() * turnRate;
    }

    public void setTurnRate(double rate) {
        turnRate = rate;
    }
}
