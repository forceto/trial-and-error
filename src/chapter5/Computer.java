package chapter5;

public class Computer {
	private Output out;
	//constructor ��������ʱ������ת��
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
