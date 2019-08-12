package chapter10;

/**
 * Created by force_to on 2016/10/3.
 */

// 自定义异常类要继承 Exception 或 RuntimeException
// 同时提供一个无参构造函数和一个带一个字符串参数的构造函数
public class Fever extends Exception{
    // 无参构造
    public Fever(){}

    // 有参构造
    public Fever(String msg) {
        super(msg);
    }
}
