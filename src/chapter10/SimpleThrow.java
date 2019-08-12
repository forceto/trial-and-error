package chapter10;

/**
 * Created by force_to on 2016/10/3.
 */
public class SimpleThrow {
    public SimpleThrow() {
/*        try {
            checkedTest();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        runtimeTest();
    }

    // 抛出checked异常
    // 在方法签名中必须有throws
    public static void checkedTest() throws Exception{
        System.out.println("checkedTest working...");
        throw new Exception("这是checkedTest 抛出的 Exception ");
    }

    // 抛出Runtime异常
    public static void runtimeTest() {
        System.out.println("runtimeTest working...");
        throw new RuntimeException("这是runtime抛出的RuntimeException");
    }
}