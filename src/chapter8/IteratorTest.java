package chapter8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
	@SuppressWarnings("rawtypes")
	Collection letterSet = new ArrayList();

	@SuppressWarnings("unchecked")
	public IteratorTest() {

		int i;
		for (i = 65; i <= 90; i++) {
			char tem = (char) i;
			letterSet.add(tem);
		}
		forEachSet();
	}

	private void forEachSet() {
		int i = 1;
		for (Object o : letterSet) {
			if (i < 10)
				System.out.print(o);
			else if(i>=10){
				System.out.println();
				i=0;
			}
			i++;
			
		}
	}

	@SuppressWarnings({ "rawtypes" })
	private void selfTry() {

		System.out.println(letterSet);
		Iterator it = letterSet.iterator();
		int j = 65;
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void IteratorTry() {
		Collection co = new HashSet();
		co.add("a");
		co.add("b");
		co.add("c");
		// 获取集合的迭代器
		Iterator it = co.iterator();
		while (it.hasNext()) {
			String a = (String) it.next();
			System.out.println(a);
			if (a.equals("b"))
				it.remove();
			a = "test string";
		}
		System.out.println(co);
	}
}
