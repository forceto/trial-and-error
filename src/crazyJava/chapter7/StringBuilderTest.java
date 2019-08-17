package crazyJava.chapter7;

public class StringBuilderTest {
	public StringBuilderTest(){
		StringBuilder s=new StringBuilder();
		s.append("abc");
		System.out.println("追加\t"+s);
		s.insert(0, "000");
		System.out.println("插入\t"+s);
		s.replace(5, 6, ",");
		System.out.println("替换\t"+s);
		s.delete(5, 6);
		System.out.println("删除\t"+s);
		s.reverse();
		System.out.println("倒置\t"+s);
	}
}
