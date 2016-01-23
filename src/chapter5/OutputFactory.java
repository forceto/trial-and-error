package chapter5;

public class OutputFactory {
	public Output getOutput(){
		return new Printer();
	}
}
