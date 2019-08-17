package crazyJava.chapter5;

import crazyJava.chapter5.StaticInnerClass;

public class OutInvokeIn {
	public OutInvokeIn(){
		//调用内部类
		//理解：内部类寄生在外部类中
		StaticInnerClass.In i=new StaticInnerClass().new In("hello");
	}
}
