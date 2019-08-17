package crazyJava.chapter9;

//带泛型声明的类
public class Apple<T> {
	private T info;
	public Apple(T info){
		this.info=info;
	}
	
	public void setInfo(T info){
		this.info=info;
	}
	
	public T getInfo(){
		return this.info;
	}


}
