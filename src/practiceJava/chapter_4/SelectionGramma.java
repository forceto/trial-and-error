package practiceJava.chapter_4;

public class SelectionGramma {

	public static void main(String[] args) {
		switchExample();
		
	}
	
	public static void switchExample() {
		for (int i = 0; i < 26; i++) {
			char j = (char) (i+ 'a');
			System.out.print(j + " 是");
			// switch表达式中 的变量可以是 char, byte, short, int,
			switch(j) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					System.out.println("元音字母");
					break;
				case 'y':
				case 'w':
					System.out.println("有时候是元音字母");
					break;
				default:
					System.out.println("辅音");
					
				
			}
		}
	}
}
