package crazyJava.chapter9;

public class Car_GenericClass<T> {
	private T name;
	public  Car_GenericClass(T tem){
		System.out.println("initiate Car_GenericClass...");
		this.name=tem;
	}
	public T getName(){
		return name;
	}
}
