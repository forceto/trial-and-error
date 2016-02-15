package chapter9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericTest {
	public GenericTest(){
		typeParameterTest();
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

	
	
}




