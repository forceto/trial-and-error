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
			System.out.println("����Խ�磬����ʱ����Ĳ�������");
		}catch(NumberFormatException ne){
			System.out.println("���ָ�ʽ�쳣");
		}catch(ArithmeticException ae){
			System.out.println("�����쳣");
		}catch(Exception e){
			System.out.println("δ֪�쳣");
		}
	}
}
