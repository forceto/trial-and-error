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
    // ��ʹ����@Deprecated �����ø÷���ʱ���ɻ�ִ��
    public void show() {
        System.out.println("Car show....  @Deprecated");
    }
}
