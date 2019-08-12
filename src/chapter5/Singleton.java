package chapter5;
//单例类 
public class Singleton {
	private static Singleton instance;
	private Singleton(){}
	public static Singleton getSingleton(){
		if(instance==null)
			instance=new Singleton();
		return instance;
	}
	
}
