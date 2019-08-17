package crazyJava.chapter16;

import java.util.concurrent.Callable;

/**
 * Created by force_to on 2016/10/4.
 */
public class FirstCallable implements Callable {
    @Override
    public Integer call() {
        int i = 0 ;
        for (; i < 100 ; i++) {
            System.out.println(Thread.currentThread().getName() + "\t" + i);

        }
        return i;
    }
}
