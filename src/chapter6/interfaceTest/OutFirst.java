package chapter6.interfaceTest;

/**
 * Created by force_to on 2016/9/21.
 */
public class OutFirst implements Out,ProduceTime{

    public OutFirst() {
        System.out.println("OutFirst constructor");
    }

    private String[] dataIn = new String[Max];
    private int now = 0;
    public void getData(String message) {
        //将信息放入数组
        if (now <= dataIn.length - 1) {
            dataIn[now] = message;
            now++;
            if (now == dataIn.length) {
                now = 0;
                System.out.println("数组已满，将从头部开始覆盖");
            }
        }
    }

    public void out() {
        int index = 0;
        for (int i = 0; i < now; i++) {
            System.out.println("第" + index + "条消息:" + dataIn[i]);
            index++;
        }
    }

    @Override
    public void showTime() {
        System.out.println("show time");
    }
}
















