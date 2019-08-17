package crazyJava.chapter6.interfaceTest;

/**
 * Created by force_to on 2016/9/21.
 */
public class RunOutFirst {
    public RunOutFirst() {
        Out o = new OutFirst();
        o.getData("hello");
        o.getData("hi");
        o.getData("lalal");
        o.getData("asd;fl ");
        o.getData("safari");
        o.out();
        o.test();
        ProduceTime p = new OutFirst();
        p.showTime();

    }
}
