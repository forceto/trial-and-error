package chapter5;

public abstract class ShapeAbstract {
	{
		System.out.println("ִ��Shape�ĳ�ʼ����");
	}
	private String color;
	//���ܳ�
	public abstract double calPerimeter();
	//������״
	public abstract String getType();
	//constructor
	public ShapeAbstract(){}
	public ShapeAbstract(String color){
		System.out.println("ִ��shape�Ĺ��캯��...");
		this.color=color;
	}
}
