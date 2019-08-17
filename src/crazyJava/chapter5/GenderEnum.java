package crazyJava.chapter5;

public enum GenderEnum {
	//直接调用MALE或FEMALE,则“男”或“女”，自动传入枚举类的构造器
	MALE("男"),FEMALE("女");
	private final String name;
	GenderEnum(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
}
