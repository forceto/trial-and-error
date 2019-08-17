package crazyJava.chapter10;

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
            System.out.println("分母有0，数组越界, 没有输入整数数字");
        } catch (Exception e) {
            System.out.println("无法处理的异常");
        }
    }
}
