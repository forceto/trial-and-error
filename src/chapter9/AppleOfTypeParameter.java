package chapter9;

/*
 * 在定义类型时设定上限
 * 传入的参数T必须是Number或其子类
 */
public class AppleOfTypeParameter <T extends Number>{
	T sum;
}
