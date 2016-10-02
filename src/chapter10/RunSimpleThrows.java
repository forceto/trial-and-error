package chapter10;

import java.io.IOException;

/**
 * Created by force_to on 2016/10/2.
 */
public class RunSimpleThrows {
    public RunSimpleThrows() {
        SimpleThrows st = new SimpleThrows();
        try {
            st.throwsException();
        } catch (IOException e) {
            System.out.println("Å×³ö IO Òì³£");
            e.printStackTrace();
        }

    }
}
