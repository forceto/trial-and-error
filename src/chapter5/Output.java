package chapter5;

public interface Output {
	int MAX_CACHE_LINE=50;
	void out();
	void getData(String msg);
	//jdk 8 Ĭ�Ϸ���  ������ֻ����default����
	default void print(String...msgs){
		 for(String msg:msgs){
			System.out.println(msg);
		}
	}
	default void test(){
		System.out.println("Ĭ�Ϸ���test����");
	}
	//jdk 8 �෽��
	static String staticTest(){
		return "�෽��";
	}
}
