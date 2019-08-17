package crazyJava.chapter6.interfaceTest;

/**
 * Created by force_to on 2016/9/21.
 */
public class OutFactory {
    public Out getOut() {
        return new OutPrinter();
    }
}
