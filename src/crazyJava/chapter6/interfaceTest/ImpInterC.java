package crazyJava.chapter6.interfaceTest;

/**
 * Created by force_to on 2016/9/21.
 */
public class ImpInterC implements InterC {
    public void testA() {
        System.out.println("testA...");
    }

    public void testB() {
        System.out.println("testB...");
    }

    public void testC() {
        System.out.println("testC...");
    }

    public void show() {
        System.out.println(InterA.a1 + "\t" + InterA.a2);
        System.out.println(InterB.b1 + "\t" + InterB.b2);
        System.out.println(InterC.c1 + "\t" + InterC.c2);
    }
}















