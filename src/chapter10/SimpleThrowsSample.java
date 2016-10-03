package chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static javafx.scene.input.KeyCode.F;

/**
 * Created by force_to on 2016/10/3.
 */
public class SimpleThrowsSample {
    public SimpleThrowsSample() throws FileNotFoundException{
        throwsProblem();
    }

    public static void throwsProblem() throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("a.txt");

    }
}
