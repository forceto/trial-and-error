package chapter10;

import java.io.*;

/**
 * Created by force_to on 2016/10/2.
 */
public class AutoTry {
    public AutoTry() throws IOException{
        //  Ϊ�˱�֤��Դ�ܱ��رգ���Դ����ʵ�� AutoCloseable �ӿڻ�Closeale�ӿ�
        try (
                //  �� () ������Ҫʹ�õ���Դ
                BufferedReader br = new BufferedReader(new FileReader("SimpleException.jsva"));
                PrintStream ps = new PrintStream(new FileOutputStream("a.txt"))
        ) {
            System.out.println(br.readLine());
            ps.println("ps");
        }
    }
}
