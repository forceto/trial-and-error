package chapter10;

/**
 * Created by force_to on 2016/10/2.
 */
public class MultiException {
    public MultiException(String... arr) {
        int a, b, c;
        try {
            a = Integer.parseInt(arr[0]);
            b = Integer.parseInt(arr[1]);
            c = a / b;
            System.out.println("result : \t" + c);
        } catch (IndexOutOfBoundsException | ArithmeticException | NumberFormatException e) {
            System.out.println("��ĸ��0������Խ��, û��������������");
        } catch (Exception e) {
            System.out.println("�޷�������쳣");
        }
    }
}
