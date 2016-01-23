package chapter5;

public class AutoBoxUnbox {
	
	public AutoBoxUnbox()
	{
		System.out.println("start ...");
		Integer inte=4;
		Object ob=true;
		int i=inte;
		if(ob instanceof Boolean)
		{
			boolean o=(boolean)ob;
			System.out.println(o);
		}
		//将字符类型转换为基本类型
		String a="123";
		int a1=Integer.parseInt(a);
		System.out.println("a="+a);
		
		String b="453.4234f";
		float b1=Float.parseFloat(b);
		System.out.println("b="+b1);
		
		System.out.println(a1+b1);
		System.out.println("--------------------------");
		Float f=new Float(b);
		System.out.println(f);
		System.out.println("--------------------------");
		//将float转换为String型
		String str=String.valueOf(1.123f);
		System.out.println("str:"+str);
		float f2=Float.parseFloat(str);
		System.out.println("f2="+f2);
		System.out.println("--------------------------");
		str=String.valueOf(true);
		System.out.println(str.toUpperCase());
		boolean strbool=Boolean.parseBoolean(str);
		System.out.println(strbool);
		String num=5+"";
		System.out.println(num);
	}
}
