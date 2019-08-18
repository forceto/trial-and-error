package practiceJava.chapter_5.extendsPractice;

public class Card1 extends Number_PhoneCard{
	
	public double balance;
	public double additoryFee;
	
	// from PhoneCard abstract method
	public boolean performDial() {
		if (balance >= 0.5 + additoryFee) {
			balance -= (0.5 + additoryFee);
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public double getBalance() {
		return balance;
	}
	
}
