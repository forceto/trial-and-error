package chapter5;

public class TestInterface {
	public TestInterface(){
		Output o=new Printer();
		o.getData("book");
		o.getData("hello");
		o.getData("english");
		o.getData("insula");
		o.out();
		o.print("peninsula","pit","marble");
		System.out.println("-------------------------");
		Product p=new Printer();
		System.out.println(p.getProductTime());
		System.out.println("-------------------------");
		//simple factory mode
		OutputFactory of=new OutputFactory();
		Computer com=new Computer(of.getOutput());
		com.keyIn("hello");
		com.keyIn("book");
		com.print();
		System.out.println("-------------------------");
		ProcessArray pro=new ProcessArray();
		int[] array={1,1,1,1};
		pro.process(array, new SumCommand());
	}
}
