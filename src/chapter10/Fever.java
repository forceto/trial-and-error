package chapter10;

/**
 * Created by force_to on 2016/10/3.
 */

// �Զ����쳣��Ҫ�̳� Exception �� RuntimeException
// ͬʱ�ṩһ���޲ι��캯����һ����һ���ַ��������Ĺ��캯��
public class Fever extends Exception{
    // �޲ι���
    public Fever(){}

    // �вι���
    public Fever(String msg) {
        super(msg);
    }
}
