package chapter16;

/**
 * Created by force_to on 2016/10/4.
 */
public class UseStartDead {
    public UseStartDead() {
        StartDead s = new StartDead();
        for (int i = 0 ; i < 300 ; i++) {
            System.out.println(Thread.currentThread().getName() + "\t" + i);
            if (i == 20) {
                s.start();
                System.out.println("线程还活着吗？\t" + s.isAlive());
            }
            if (i > 20 && !s.isAlive()) {
                s.start();
            }
        }
    }
}
