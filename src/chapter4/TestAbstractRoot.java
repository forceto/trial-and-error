package chapter4;

public abstract class TestAbstractRoot {
	{
		System.out.println("ִ��TestAbstrctRoot�ĳ�ʼ����");
	}
	private String color;
	public abstract double calPerimeter();
	public abstract String getType();
	public TestAbstractRoot(){}
	public TestAbstractRoot(String color)
	{
		System.out.println("ִ��TestAbstractRoot���вι�����...");
		this.color=color;
	}
}
