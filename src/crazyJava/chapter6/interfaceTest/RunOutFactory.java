package crazyJava.chapter6.interfaceTest;

/**
 * Created by force_to on 2016/9/21.
 */
public class RunOutFactory {
    public RunOutFactory() {
        OutFactory factory = new OutFactory();
        Computer c = new Computer(factory.getOut());
        c.keyIn("hello");
        c.print();
    }

}
