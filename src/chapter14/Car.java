package chapter14;

/**
 * Created by force_to on 2016/10/3.
 */
public class Car extends Vehicle {
    public Car() {
        System.out.println("this is Car class");
    }

    @Override
    public void buyCar() {
        System.out.println("buyCar...");
        System.out.println("yeah~ you get a bus");
    }

    @Deprecated
    // 即使用了@Deprecated 当调用该方法时依旧会执行
    public void show() {
        System.out.println("Car show....  @Deprecated");
    }
}
