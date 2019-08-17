package practiceJava.chapter_5;

abstract class PhoneCard {
	
	double balance = 100;
	public abstract boolean performDial();
	
	public double getBalance() {
		return balance;
	}
}



