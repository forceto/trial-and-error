package crazyJava.chapter5;

public class Triangle extends ShapeAbstract {
	private double a;
	private double b;
	private double c;
	private String color;
	public Triangle(String color,double a,double b,double c){
		super(color);
		this.setSide(a,b,c);
	}
	private void setSide(double a,double b,double c){
		if(a>=b+c || b>=a+c || c>= a+b){
			System.out.println("无法构成三角形");
		}
		else{
			System.out.println("Triangle bingo!");
			this.a=a;
			this.b=b;
			this.c=c;
		}
	}
	//实现抽象方法
	public double calPerimeter(){ 
		return a+b+c;
	}
	public String getType(){
		return "Triangle";
	}
}