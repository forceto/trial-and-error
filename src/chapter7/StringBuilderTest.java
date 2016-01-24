package chapter7;

public class StringBuilderTest {
	public StringBuilderTest(){
		StringBuilder s=new StringBuilder();
		s.append("abc");
		System.out.println("×·¼Ó\t"+s);
		s.insert(0, "000");
		System.out.println("²åÈë\t"+s);
		s.replace(5, 6, ",");
		System.out.println("Ìæ»»\t"+s);
		s.delete(5, 6);
		System.out.println("É¾³ı\t"+s);
		s.reverse();
		System.out.println("µ¹ÖÃ\t"+s);
	}
}
