package chapter5;

public class InnerClass {
	private String a="�ⲿ��ʵ������";
	private String b="^_^";
	//inner class
	private class InClass{
		private String a="�ڲ���ʵ������";
		public void info(){
			String a="�ڲ���ֲ�����";
			//output
			System.out.println(InnerClass.this.a);
			System.out.println(this.a);
			System.out.println(a);
		}
		public void accessOut(){
			System.out.println("�ⲿ���Ա����"+b);
		}
	}
	public void test(){
		new InClass().info();
	}
	public void accessIn(){
		InClass i=new InClass();
		i.accessOut();
		System.out.println("i.a="+i.a);
		System.out.println("�ڲ���ʵ��������"+new InClass().a);
	}
}
