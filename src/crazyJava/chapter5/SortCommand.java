package crazyJava.chapter5;

import java.util.Arrays;

public class SortCommand implements Command{

	@Override
	public void process(int[] a) {
		Arrays.sort(a);
		for(int q:a){
			System.out.println(q);
		}
	}
	
}
