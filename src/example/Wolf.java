package example;

public class Wolf extends Animal {
	public Wolf()
	{
		System.out.println("i am a wolf");
		System.out.println("age:"+"\t"+age+"\t"+"size:"+"\t"+size+"\t"
				          +"weight:"+"\t"+weight);
		fly();
	}
	public void fly()
	{
		System.out.println("i am a wolf,i can't fly,i run fast");
	}
}
