package chapter10;

/**
 * Created by force_to on 2016/10/3.
 */
public class SimpleThrow {
    public SimpleThrow() {
/*        try {
            checkedTest();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        runtimeTest();
    }

    // �׳�checked�쳣
    // �ڷ���ǩ���б�����throws
    public static void checkedTest() throws Exception{
        System.out.println("checkedTest working...");
        throw new Exception("����checkedTest �׳��� Exception ");
    }

    // �׳�Runtime�쳣
    public static void runtimeTest() {
        System.out.println("runtimeTest working...");
        throw new RuntimeException("����runtime�׳���RuntimeException");
    }
}
















