package crazyJava.chapter10;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by force_to on 2016/10/2.
 */
public class SimpleFinally {
    public SimpleFinally() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("执行finally块中的代码，释放资源");
        }

    }
}