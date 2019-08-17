package crazyJava.chapter5;

import java.util.Arrays;

public class TestFinal {
	public TestFinal(){
		final Person p=new Person("hello");
		System.out.println(p.toString());
		p.setName("wow");
		System.out.println(p.toString());
		
		final int[] array={12,123,14,345,3,23,4};
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		//final 修饰的方法不能被重写
		
	}
	
}
