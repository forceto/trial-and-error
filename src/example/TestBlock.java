package example;

public class TestBlock {
	public int a=3;
	{
		
		System.out.println("正在执行初始化快...");
		if(a==3)
			System.out.println("execute 'public int a=3' first");
		a=1;
	}
	public TestBlock()
	{
		System.out.println("a="+a);
	}
	
	
}
