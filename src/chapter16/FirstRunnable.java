package chapter16;

/**
 * Created by force_to on 2016/10/4.
 */
public class FirstRunnable implements Runnable {
    private int i;

    @Override
    public void run() {
        for (; i < 100 ; i++) {
            // 当线程类实现Runnable接口后，
            // 只能使用Thread.currentThread来获取当前线程
            System.out.println(Thread.currentThread().getName() + "\t" + i);
        }
    }
}