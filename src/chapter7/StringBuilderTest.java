package chapter7;

public class StringBuilderTest {
	public StringBuilderTest(){
		StringBuilder s=new StringBuilder();
		s.append("abc");
		System.out.println("׷��\t"+s);
		s.insert(0, "000");
		System.out.println("����\t"+s);
		s.replace(5, 6, ",");
		System.out.println("�滻\t"+s);
		s.delete(5, 6);
		System.out.println("ɾ��\t"+s);
		s.reverse();
		System.out.println("����\t"+s);
	}
}
