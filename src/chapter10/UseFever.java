package chapter10;

/**
 * Created by force_to on 2016/10/3.
 */
public class UseFever {
    public UseFever() {
        try {
            throwFever();
        } catch (Exception e) {
//            System.out.println("e.getMessage(): \t" + e.getMessage());
//            System.out.println();
            System.out.print("e.printStackTrace():\t");
            e.printStackTrace();
        }
    }

    public static void throwFever() throws Exception{
        throw new Fever("我发烧了...");
    }
}
