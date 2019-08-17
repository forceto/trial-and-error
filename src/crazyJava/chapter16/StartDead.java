package crazyJava.chapter16;

/**
 * Created by force_to on 2016/10/4.
 */
public class StartDead extends Thread {
    private int i;

    @Override
    public void run() {
        for (; i < 100 ; i++) {
            System.out.println(Thread.currentThread().getName() + "\t" + i);
        }
    }
}
