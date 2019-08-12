package chapter9;

//泛型构造器例子
public class Foo_GenericConstructorTest {
	public <T> Foo_GenericConstructorTest(T t){
		System.out.println(t);
	}
}
