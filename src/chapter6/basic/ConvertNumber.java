package chapter6.basic;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.Scanner;

/**
 * Created by force_to on 2016/9/9.
 */
public class ConvertNumber {

    private String[] hanArr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
    private String[] unityArr = {"十", "百", "千"};

    public ConvertNumber(){
        Scanner s = new Scanner(System.in);
        System.out.println("开始ConvertNumber...");
        System.out.println("请输入浮点数...");
        String inputNum = s.next();
        startConvert(inputNum);
    }

    private void startConvert(String inputNum) {
        // String --> double
        double original = Double.valueOf(inputNum);
        // 截取整数部分
        long integer = (long)original;
        double decimal = original - integer;
        long finalDecimal = (long) (Math.round(decimal * 100));
        System.out.println("integer:  " + integer + "\tdecimal:  " + finalDecimal);
        String[] str = {integer + "", String.valueOf(finalDecimal)};
        System.out.println("分离出来的部分");
        System.out.println("整数： " + integer + "\t小数后两位: " + finalDecimal);


    }

}










