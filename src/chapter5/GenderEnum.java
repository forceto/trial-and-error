package chapter5;

public enum GenderEnum {
	//ֱ�ӵ���MALE��FEMALE,���С���Ů�����Զ�����ö����Ĺ�����
	MALE("��"),FEMALE("Ů");
	private final String name;
	GenderEnum(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
}
