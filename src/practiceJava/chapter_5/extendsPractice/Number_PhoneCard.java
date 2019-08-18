package practiceJava.chapter_5.extendsPractice;

abstract class Number_PhoneCard extends PhoneCard{
	public long cardNumber;
	public int password;
	public String connectNumber;
	public boolean connected;
	
	public boolean performConnection(long cn, int pw) {
		if (cn == cardNumber && pw == password) {
			connected = true;
			return true;
		} else {
			return false;
		}
	}

}
