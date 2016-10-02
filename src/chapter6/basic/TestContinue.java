package chapter6.basic;

/**
 * Created by force_to on 2016/9/8.
 */
public class TestContinue {
    public TestContinue() {
        runContinue();
    }

    private void runContinue() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 1) {
                    continue;
                }
                System.out.println("i:\t" + i + "\tj:\t" + j);
            }
        }
    }
}
