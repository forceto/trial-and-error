package chapter5;

public interface Output {
	int MAX_CACHE_LINE=50;
	void out();
	void getData(String msg);
	//jdk 8 默认方法  必须且只能用default修饰
	default void print(String...msgs){
		 for(String msg:msgs){
			System.out.println(msg);
		}
	}
	default void test(){
		System.out.println("默认方法test（）");
	}
	//jdk 8 类方法
	static String staticTest(){
		return "类方法";
	}
}
