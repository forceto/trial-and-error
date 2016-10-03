package chapter10;

import java.io.*;

/**
 * Created by force_to on 2016/10/2.
 */
public class AutoTry {
    public AutoTry() throws IOException{
        //  为了保证资源能被关闭，资源必须实现 AutoCloseable 接口或Closeale接口
        try (
                //  在 () 中声明要使用的资源
                BufferedReader br = new BufferedReader(new FileReader("SimpleException.jsva"));
                PrintStream ps = new PrintStream(new FileOutputStream("a.txt"))
        ) {
            System.out.println(br.readLine());
            ps.println("ps");
        }
    }
}
