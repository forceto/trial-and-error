package chapter6.basic;

/**
 * Created by force_to on 2016/9/12.
 */
public class ReturnThis {
    public int age = 0;

    public ReturnThis grow() {
        age++;
        return this;
    }
}
