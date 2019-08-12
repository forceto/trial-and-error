package chapter5;

public abstract class ShapeAbstract {
	{
		System.out.println("执行Shape的初始化快");
	}
	private String color;
	//算周长
	public abstract double calPerimeter();
	//返回形状
	public abstract String getType();
	//constructor
	public ShapeAbstract(){}
	public ShapeAbstract(String color){
		System.out.println("执行shape的构造函数...");
		this.color=color;
	}
}
