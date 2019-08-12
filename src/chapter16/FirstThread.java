package chapter16;

/**
 * Created by force_to on 2016/10/4.
 */
public class FirstThread extends Thread {
    private int i;

    @Override
    public void run() {
        for (; i < 100 ; i++) {
            // 当线程类继承Thread时，可直接使用this获取当前线程
            System.out.println(this.getName() + "\t" + i);
        }
    }
}
