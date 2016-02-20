package aaaRunMain;


import chapter4.*;
import chapter5.*;
import chapter7.*;
import chapter8.*;
import chapter9.*;

public class Run {
	public static void main(String args[]) {
		try{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println("result:\t"+c);
		}catch(IndexOutOfBoundsException ie){
			System.out.println("数组越界，运行时输入的参数不够");
		}catch(NumberFormatException ne){
			System.out.println("数字格式异常");
		}catch(ArithmeticException ae){
			System.out.println("算术异常");
		}catch(Exception e){
			System.out.println("未知异常");
		}
	}
}
