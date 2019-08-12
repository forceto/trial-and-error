package chapter9;

public class SmallApple extends Apple{
	public SmallApple(String s){
		super(s);
	}
	
	public String getInfo(){
		//super.getInfo()返回的是Object类型
		return super.getInfo().toString();
	}
}
