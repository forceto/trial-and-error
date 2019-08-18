package practiceJava.chapter_5.extendsPractice;

public class Card {
	
	public static void main(String[] args) {
		Card1 mycard = new Card1();
		mycard.balance = 60;
		mycard.additoryFee = 0.3;
		System.out.println("子类的金额 : " + mycard.balance);
		if (mycard.performDial()) {
			System.out.print("打了一次电话后 : \t");
			System.out.println("子类的金额 : " + mycard.getBalance());
		}
	}
}
