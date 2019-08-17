package crazyJava.chapter5;

public class SumCommand implements Command{
	int sum;
	@Override
	public void process(int[] a) {
	
		for(int q:a){
			sum+=q;
		}
		System.out.println("sum="+sum);
	}
	
}
