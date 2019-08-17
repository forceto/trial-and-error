package crazyJava.chapter4;

public class TestBlock {
	public int a=3;
	{
		
		System.out.println("����ִ�г�ʼ����...");
		if(a==3)
			System.out.println("execute 'public int a=3' first");
		a=1;
	}
	public TestBlock()
	{
		System.out.println("a="+a);
	}
	
	
}
