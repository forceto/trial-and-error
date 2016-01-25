package chapter7;
import static java.util.Calendar.*;

import java.time.Month;
import java.util.Calendar;

public class CalenderTest {
	public CalenderTest(){
		
	}
	private void test1(){
		Calendar c=Calendar.getInstance();
		System.out.println(c.getTime()); 
		System.err.println(c.get(YEAR));
		//月份从0开始到11，显示值比实际月份小一
		System.err.println(c.get(MONTH));
		System.err.println(c.get(DATE));
		System.out.println("----------------------");
		Calendar d=Calendar.getInstance();
		d.set(2003, 7, 23, 0, 0, 0);
		d.add(MONTH, 6);
		System.out.println(d.getTime());
		System.out.println("----------------------");
		Calendar q=Calendar.getInstance();
		q.set(2003, 7, 31, 0, 0, 0);
		q.add(MONTH, 6);
		System.out.println(q.getTime());
		System.out.println("----------------------");
	}
	private void test2(){
		Calendar e=Calendar.getInstance();
		e.set(MONTH, 13);
		System.out.println(e.getTime());
//		e.setLenient(false);
//		e.set(MONTH, 13);
//		System.out.println(e.getTime());

	}
	private void setAmendDelay(){ 
		//set()方法的延迟修改
		Calendar ca=Calendar.getInstance();
		ca.set(2003, 7, 31);
		ca.set(MONTH, 8);
//		System.out.println(ca.getTime());
		ca.set(DATE,5);
		System.out.println(ca.getTime());
	}
}
