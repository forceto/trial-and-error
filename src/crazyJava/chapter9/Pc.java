package crazyJava.chapter9;

public class Pc<T extends Number> {
	T tem;
	public Pc(T tem){
		this.tem=tem;
		show();
	}
	
	private void show(){
		System.out.println(tem);
	}
}
