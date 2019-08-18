package practiceJava.chapter_5.extendsPractice;

public class Bird extends Animal{
	
	public void fly() {
		System.out.println("flying...");
	}

	public static void main(String[] args) {
		Bird bird = new Bird();
		System.out.println("eye : " + bird.eye);
		System.out.println("leg : "+ bird.leg);
		bird.eat();
		bird.run();
		bird.fly();
	}
}
