package example;

public class Bird extends Animal{
	public Bird()
	{
		System.out.println("i am a bird");
		age=4;
		size=2;
		weight=20;
		System.out.println("age:"+"\t"+age+"\t"+"size:"+"\t"+size+"\t"
		          +"weight:"+"\t"+weight);
		fly();
		System.out.println();
	}
	public void fly()
	{
		System.out.println("i am a bird,i fly free");
	}
}
