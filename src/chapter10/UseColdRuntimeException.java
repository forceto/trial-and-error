package chapter10;

/**
 * Created by force_to on 2016/10/3.
 */
public class UseColdRuntimeException {
    public UseColdRuntimeException() {
        try {
            test();
        } catch (ColdRuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void useTry() {

    }

    public static void test() {
        throw new ColdRuntimeException("我感冒了...");
    }
}
