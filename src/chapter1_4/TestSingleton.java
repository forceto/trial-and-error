package chapter1_4;

public class TestSingleton {
	//单例类，通过该类创建的任意个数的实例都指向同一个对象。
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
