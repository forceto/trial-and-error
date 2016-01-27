package chapter1_4;

public class TestSingleton {
	//�����࣬ͨ�����ഴ�������������ʵ����ָ��ͬһ������
	private TestSingleton(){}
	private int a;
	private static TestSingleton single=null;
	public static TestSingleton getInstance()
	{
		if (single==null)
			single=new TestSingleton();
		return single;
	}
	public void put()
	{
		System.out.println("Singleton");
	}
	public void setA(int a)
	{
		this.a=a;
	}
	public void getA()
	{
		System.out.println("a:"+a);
	}
}
