package chapter16;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by force_to on 2016/10/4.
 */
public class UseFirstCallable {
    public UseFirstCallable() {
        FutureTask<Integer> f1 = new FutureTask<Integer>(new FirstCallable());
        FutureTask<Integer> f2 = new FutureTask<Integer>(new FirstCallable());
        for (int i = 0 ; i < 100 ; i++) {
            System.out.println(Thread.currentThread().getName() + "\t" + i);
            if (i == 20) {
                //创建线程
                new Thread(f1, "aaa").start();
                new Thread(f2, "bbbbbbbbb").start();
            }
        }

        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}