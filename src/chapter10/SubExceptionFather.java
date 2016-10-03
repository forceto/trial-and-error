package chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by force_to on 2016/10/3.
 */
public class SubExceptionFather extends ExceptionFather {
    public SubExceptionFather() {
        System.out.println("SubExceptionFather constructor");
    }

    @Override
    public void test() throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("b.txt");
    }
}
