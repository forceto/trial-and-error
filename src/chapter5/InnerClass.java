package chapter5;

public class InnerClass {
	private String a="外部类实例变量";
	private String b="^_^";
	//inner class
	private class InClass{
		private String a="内部类实例变量";
		public void info(){
			String a="内部类局部变量";
			//output
			System.out.println(InnerClass.this.a);
			System.out.println(this.a);
			System.out.println(a);
		}
		public void accessOut(){
			System.out.println("外部类成员变量"+b);
		}
	}
	public void test(){
		new InClass().info();
	}
	public void accessIn(){
		InClass i=new InClass();
		i.accessOut();
		System.out.println("i.a="+i.a);
		System.out.println("内部类实例变量："+new InClass().a);
	}
}
