package crazyJava.chapter6.basic;

/**
 * Created by force_to on 2016/9/12.
 */
public class VariableNumberParameter {
    public VariableNumberParameter() {
        String[] str = {"hello", "hi", "wow"};
        precessStr(str);
        precessStr("w", "h", "i", "o");
    }

    private void precessStr(String... str) {
        System.out.print(str.length);
        for(String s : str) {
            System.out.print(s + "\t");
        }
        System.out.println();
    }
}
