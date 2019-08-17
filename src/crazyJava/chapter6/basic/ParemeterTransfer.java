package crazyJava.chapter6.basic;

/**
 * Created by force_to on 2016/9/12.
 */
public class ParemeterTransfer {
    public ParemeterTransfer() {
        int a = 1;
        int b = 9;
        System.out.println("交换前 a = " + a + "   b = " + b);
        swap(a, b);
        System.out.println("交换后 a = " + a + "   b = " + b);
    }

    private void swap(int a, int b) {
        System.out.println("swap 中,接收到的  a = " + a + "   b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("swap 中,交换后的  a = " + a + "   b = " + b);

    }


}
