package chapter16;

/**
 * Created by force_to on 2016/10/4.
 */
public class FirstRunnable implements Runnable {
    private int i;

    @Override
    public void run() {
        for (; i < 100 ; i++) {
            // ���߳���ʵ��Runnable�ӿں�
            // ֻ��ʹ��Thread.currentThread����ȡ��ǰ�߳�
            System.out.println(Thread.currentThread().getName() + "\t" + i);
        }
    }
}












