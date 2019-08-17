package crazyJava.chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static javafx.scene.input.KeyCode.F;

/**
 * Created by force_to on 2016/10/2.
 */
public class SimpleThrows {
    // 当不知道如何处理当前的异常时
    // 就通过在方法的声明中增加 throws
    // 让方法的调用者处理异常
    public SimpleThrows() {
    }

    public  void showException() throws IOException{
        throwsException();
    }

    public void throwsException() throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
    }
}