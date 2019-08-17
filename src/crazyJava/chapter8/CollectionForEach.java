package crazyJava.chapter8;

import java.util.Collection;
import java.util.HashSet;

public class CollectionForEach {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public CollectionForEach(){
		
		Collection co=new HashSet();
		co.add("a");
		co.add("b");
		co.add("c");
		co.forEach(a->System.out.println(a));
		
	}
}
