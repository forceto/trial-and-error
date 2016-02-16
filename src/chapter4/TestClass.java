package chapter4;

public class TestClass {
	public TestClass()
	{
		System.out.println("People eye number:"+"\t"+People.eyenum);
		People p=new People();
		System.out.println("People eye number:"+"\t"+p.eyenum);
		p.name="SONY";
		p.eyenum=2;
		People p2=new People();
		System.out.println(p2.name+"\t"+p2.eyenum);
		System.out.println(People.eyenum);
	}
}

















