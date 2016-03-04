package aaaRunMain;

import chapter10.Person;
public class Run {
	public static void main(String args[]) {
		Person p = new Person();
		p.setAge(-3);
	}

	public static void exception1(String[] args) {
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
