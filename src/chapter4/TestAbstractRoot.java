package chapter4;

public abstract class TestAbstractRoot {
	{
		System.out.println("执行TestAbstrctRoot的初始化快");
	}
	private String color;
	public abstract double calPerimeter();
	public abstract String getType();
	public TestAbstractRoot(){}
	public TestAbstractRoot(String color)
	{
		System.out.println("执行TestAbstractRoot的有参构造器...");
		this.color=color;
	}
}
