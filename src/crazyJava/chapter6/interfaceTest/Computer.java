package crazyJava.chapter6.interfaceTest;

/**
 * Created by force_to on 2016/9/21.
 */
public class Computer {
    private Out out;

    public Computer(Out out) {
        this.out = out;
    }

    public void keyIn(String msg) {
        out.getData(msg);
    }

    public void print() {
        out.out();
    }
}





















