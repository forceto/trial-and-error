package chapter9;

public class SmallApple extends Apple{
	public SmallApple(String s){
		super(s);
	}
	
	public String getInfo(){
		//super.getInfo()���ص���Object����
		return super.getInfo().toString();
	}
}
