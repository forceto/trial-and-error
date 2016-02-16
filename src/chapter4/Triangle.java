package chapter4;

public class Triangle  extends TestAbstractRoot {
	private double a;
	private double b;
	private double c;
	public Triangle(String color,double a,double b,double c)
	{
		super(color);
		this.setSides(a,b,c);
	}
	
	private void setSides(double a, double b, double c) {
		if(a>b+c||b>a+c||c>a+b){
			System.out.println("两边之和要大于第三边");
		}
		this.a=a;
		this.b=b;
		this.c=c;
	}

	@Override
	public double calPerimeter() {
		return a+b+c;
	}
	@Override
	public String getType() {
		return "三角形";
	}

	
}
	