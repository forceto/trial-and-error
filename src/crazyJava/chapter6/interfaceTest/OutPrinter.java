package crazyJava.chapter6.interfaceTest;

/**
 * Created by force_to on 2016/9/21.
 */
public class OutPrinter implements Out {
    String[] store = new String[1];

    @Override
    public void getData(String message) {
        System.out.println(message);
        store[0] = message;
    }

    @Override
    public void out() {
        System.out.println(store[0]);
    }
}
