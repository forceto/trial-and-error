package chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static javafx.scene.input.KeyCode.F;

/**
 * Created by force_to on 2016/10/2.
 */
public class SimpleThrows {
    // ����֪����δ���ǰ���쳣ʱ
    // ��ͨ���ڷ��������������� throws
    // �÷����ĵ����ߴ����쳣
    public SimpleThrows() {
    }

    public  void showException() throws IOException{
        throwsException();
    }

    public void throwsException() throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
    }
}











