package chapter16;

/**
 * Created by force_to on 2016/10/4.
 */
public class FirstThread extends Thread {
    private int i;

    @Override
    public void run() {
        for (; i < 100 ; i++) {
            // ���߳���̳�Threadʱ����ֱ��ʹ��this��ȡ��ǰ�߳�
            System.out.println(this.getName() + "\t" + i);
        }
    }
}
