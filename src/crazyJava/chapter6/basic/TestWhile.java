package crazyJava.chapter6.basic;

/**
 * Created by force_to on 2016/9/8.
 */
public class TestWhile {
    public TestWhile() {
        runDoWhile();
    }

    private void runDoWhile() {
        int i = 0;
        do {
            System.out.println(i++);
        }while (i < 9);
    }

    private void runWhile() {
        int i = 0;
        while (i < 10) {
            int[] arr = new int[i];
            System.out.println(arr.length);
            i++;
        }
    }


}
