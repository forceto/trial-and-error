package chapter5;

public class EnumTest {
	public EnumTest(SeasonEnum s){
		//switch（） 中的值可以是枚举值
		switch(s){
		case SPRING:
			System.out.println("春");
			break;
		case SUMMER:
			System.out.println("夏");
			break;
		case FALL:
			System.out.println("秋");
			break;
		case WINTER:
			System.out.println("冬");
		}
		
	}
}
