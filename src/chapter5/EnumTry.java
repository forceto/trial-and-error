package chapter5;

public class EnumTry {
	public EnumTry(){
		EnumTest e=new EnumTest(SeasonEnum.FALL);
		//Enum �� values��������Ϊ��������
		for(SeasonEnum s:SeasonEnum.values()){
			new EnumTest(s);
		}
		GenderEnum g=GenderEnum.MALE;
		System.out.println(g.getName());
	}
}
