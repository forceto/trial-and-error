package chapter7;

public class CloneTest {
	public CloneTest() throws CloneNotSupportedException{
		User u1=new User(21);
		User u2=u1.clone();
		System.out.println(u1==u2);
		//clone �򵥸��ƣ���ʵ���������������ͣ���ֻ�Ǽ򵥵ظ�������������ͣ����ԣ�ָ��ͬһ��ʵ��
		System.out.println(u1.address==u2.address);
	}
}
