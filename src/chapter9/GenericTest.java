package chapter9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericTest {
	public GenericTest(){
		useGenericMthod();
	}
	
	//java 7 的菱形语法
	private void diamondGrammar(){
		List<String> book=new ArrayList<>();
		book.add("java");
		book.add("java EE");
		book.add("android");
		System.out.println(book);
		
		Map<String,List<String>> school=new HashMap<>();
		List<String> s=new ArrayList<>();
		s.add("33");
		s.add("1");
		s.add("1");
		school.put("school", s);
		System.out.println(school );
	}
	
	private void userDefinedClassWithGeneric(){

		Apple<String> a=new Apple<>("Mac");
		System.out.println(a.getInfo());
		a.setInfo("Canon");
		System.out.println(a.getInfo());
		//基本类型要用包装类
		Apple<Float> app=new Apple<>(2.23424f);
		System.out.println(app.getInfo());
		app.setInfo(4.454454f);
		System.out.println(app.getInfo());
	}
	
	private void redAppleTest(){
		RedApple r=new RedApple(111.123123123);
		System.out.println(r.getInfo());
		r.setInfo(2.123131);
		System.out.println(r.getInfo());
	}
	
	//带泛型声明的类
	private void SmallAppleTest(){
		SmallApple s=new SmallApple("smallApple...");
		System.out.println(s.getInfo());
	}
	
	//类型通配符的上限
	private void upperBoundTest(){
		/*
		 * 抽象类Shape
		 * CircleOfShape和RectangleOfShape是Shape的子类
		 * Shape为<? extends Shape>中?代表的为知类型的通配符   上限(upper bound)
		 * 即：?代表的类必须是Shape的子类
		 */
		List<CircleOfShape> circle=new ArrayList<>();
		circle.add(new CircleOfShape());
		Canvas canvas=new Canvas();
		canvas.drawAll(circle);
	}
	
	private void upperBoundTest2(){
		Set<DiomandOfShape> diomand=new HashSet<>();
		diomand.add(new DiomandOfShape());
		Canvas canvas=new Canvas();
		canvas.drawDiomand(diomand);
	}

	//在定义类型时设定上限
	private void typeParameterTest(){
		AppleOfTypeParameter<Float> a1=new AppleOfTypeParameter<>();
		a1.sum=1000f;
		System.out.println(a1.sum);
//		String 不是Number的子类，下行报错
//		AppleOfTypeParameter<String> a2=new AppleOfTypeParameter<>();
	}
	
	//定义泛型方法，把array复制到Collection
	public <T> void fromArrayToCollection(T[] a,Collection<T> c){
		for(T o:a){
			c.add((T) a);
		}
	}
	
	//使用泛型方法
	public void genericMethodTest(){
		Object[] ob=new Object[100];
		for(int i=0;i<ob.length;i++){
			ob[i]=(int)Math.random()*100;
		}
		
		Collection<Object> co=new ArrayList<>();
		//T-->Object
		fromArrayToCollection(ob, co);
		System.out.println(co);
		
		String [] sa=new String[10];
		Collection<String> cs=new ArrayList<>();
		//T-->String	sa-->String 	cs-->String
		fromArrayToCollection(sa, cs);
		
		/*
		 * --------以集合类的泛型为准----------
		 * 以Collection中的泛型为最高上限，数组的类型必须是其或其子类
		 */
		//T-->Object	sa-->String 	co-->Object
		//因为String为Object的子类所以可以
		fromArrayToCollection(sa, co);
		
		Integer [] ia=new Integer[10];
		Float [] fa=new Float[10];
		Number [] na=new Number[10];
		Collection<Number> cn=new ArrayList<>();
		
		//T-->Number	ia-->Integer	cn-->Number
		fromArrayToCollection(ia, cn);
		
		//T-->Number	fa-->Float		cn-->Number 
		fromArrayToCollection(fa, cn);
		
		//T-->Number 	na-->Number 	cn-->Number
		fromArrayToCollection(na, cn);
		
		//T-->Object	na-->Number		co-->Object 
		fromArrayToCollection(na, co);

		//na-->Number 	cs-->String		Number不是String也不是其子类所以报错
		//romArrayToCollection(na, cs); 
	}
	
	private <T> void genericMethodTest2(List<? extends T> from,List<T> to){
		for(T tem: from){
			to.add(tem);
		}
	}
	
	private void useGenericMthod(){
		List<Integer> apple=new ArrayList<>();
		for(int i=0;i<5;i++){
			apple.add(i*i);
		}
		List<Number> fruit=new ArrayList<>();
		genericMethodTest2(apple, fruit);
		System.out.println("apple:"+apple);
		System.out.println("fruit:"+fruit);
	}
}




