package crazyJava.chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by force_to on 2016/10/3.
 */
public class ExceptionFather {
    public ExceptionFather(){
        System.out.println("ExceptionFather constructor");
    }

    public void test() throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("a.txt");
    }
}
