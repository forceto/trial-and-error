package chapter5;

public class PrintCommand implements Command{

	@Override
	public void process(int[] a) {
		for(int b:a){
			System.out.println(b);
		}
	}
	
}
