package crazyJava.chapter16;

/**
 * Created by force_to on 2016/10/4.
 */

public class UseFirstThread {
    public UseFirstThread() {
        for (int i = 0 ; i < 100 ; i++) {
            // Thread.currentThread() 获取当前线程
            System.out.println(Thread.currentThread().getName() + "\t" + i);
            if (i == 20) {
                // 创建并启动一个线程
                new FirstThread().start();
                // 创建并启动第二个线程
                new FirstThread().start();
            }
        }
    }
}
