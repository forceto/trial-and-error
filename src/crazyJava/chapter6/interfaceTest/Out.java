package crazyJava.chapter6.interfaceTest;

/**
 * Created by force_to on 2016/9/21.
 */
public interface Out {
    public static final int Max = 4;
    public abstract void getData(String message);
    public abstract void out();

    // 定义默认方法
    default void print(String... message) {
        int index = 0;
        for (String i : message) {
            System.out.println("第"+ index + "条信息:\t" + i);
        }
    }

    default void test() {
        System.out.println("接口正常运行...");
    }

    // 定义类方法
    public static void staticShow() {
        System.out.println("Out中的类方法...");
    }
}
















