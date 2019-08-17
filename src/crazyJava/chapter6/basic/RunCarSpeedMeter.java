package crazyJava.chapter6.basic;

/**
 * Created by force_to on 2016/9/17.
 */
public class RunCarSpeedMeter {
    public RunCarSpeedMeter() {
        CarSpeedMeter c = new CarSpeedMeter();
        c.setTurnRate(23);
        System.out.println(c.getSpeed());
    }
}
