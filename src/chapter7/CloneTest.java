package chapter7;

public class CloneTest {
	public CloneTest() throws CloneNotSupportedException{
		User u1=new User(21);
		User u2=u1.clone();
		System.out.println(u1==u2);
		//clone 简单复制，若实例变量是引用类型，则只是简单地复制这个引用类型，所以，指向同一个实例
		System.out.println(u1.address==u2.address);
	}
}
