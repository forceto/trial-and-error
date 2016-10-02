package chapter10;

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
            //����Խ��
            System.out.println("����Խ��");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());

        } catch (NumberFormatException e) {
            System.out.println("����Ĳ�����������");
        } catch (ArithmeticException e) {
            // ��ĸΪ0ʱ����
            System.out.println("�����쳣");
        } catch (Exception e) {
            System.out.println("�޷�������쳣");
        }
    }
}
