package chapter7;

public class StringBuilderTest {
	public StringBuilderTest(){
		StringBuilder s=new StringBuilder();
		s.append("abc");
		System.out.println(s);
		s.insert(0, "000");
		System.out.println(s);
		s.replace(5, 6, ",");
		System.out.println(s);
		s.delete(5, 6);
		System.out.println(s);
		s.reverse();
		System.out.println(s);
	}
}
