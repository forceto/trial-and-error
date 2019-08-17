package crazyJava.chapter5;

public class EnumTry {
	public EnumTry(){
		EnumTest e=new EnumTest(SeasonEnum.FALL);
		//Enum 的 values（）方法为遍历函数
		for(SeasonEnum s:SeasonEnum.values()){
			new EnumTest(s);
		}
		GenderEnum g=GenderEnum.MALE;
		System.out.println(g.getName());
	}
}
