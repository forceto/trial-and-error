package crazyJava.chapter5;

public class Computer {
	private Output out;
	//constructor 参数传递时发生上转型
	public Computer(Output out){
		this.out=out;
	}
	public void keyIn(String m){
		out.getData(m);
	}
	public void print(){
		out.out();
	}
}
