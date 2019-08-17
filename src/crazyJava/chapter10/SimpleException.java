package crazyJava.chapter10;

/**
 * Created by force_to on 2016/10/2.
 */
public class SimpleException {
    public SimpleException(String args[]) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("result :\t" + c);
        } catch (IndexOutOfBoundsException e) {
            //索引越界
            System.out.println("索引越界");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());

        } catch (NumberFormatException e) {
            System.out.println("输入的不是整数数字");
        } catch (ArithmeticException e) {
            // 分母为0时出现
            System.out.println("算数异常");
        } catch (Exception e) {
            System.out.println("无法捕获的异常");
        }
    }
}
