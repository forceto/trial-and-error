package chapter16;

/**
 * Created by force_to on 2016/10/4.
 */
public class UseFirstRunnable {
    public UseFirstRunnable() {
        for (int i = 0 ; i < 100 ; i++) {
            System.out.println(Thread.currentThread().getName() + "\t" + i);
            if (i == 20) {
                FirstRunnable f = new FirstRunnable();
                //������һ���߳�
                new Thread(f,"aaa").start();
                // �����ڶ����߳�
                new Thread(f, "bbbbbbbbbbbbb").start();
            }
        }
    }
}
