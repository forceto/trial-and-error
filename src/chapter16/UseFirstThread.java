package chapter16;

/**
 * Created by force_to on 2016/10/4.
 */

public class UseFirstThread {
    public UseFirstThread() {
        for (int i = 0 ; i < 100 ; i++) {
            // Thread.currentThread() ��ȡ��ǰ�߳�
            System.out.println(Thread.currentThread().getName() + "\t" + i);
            if (i == 20) {
                // ����������һ���߳�
                new FirstThread().start();
                // �����������ڶ����߳�
                new FirstThread().start();
            }
        }
    }
}
