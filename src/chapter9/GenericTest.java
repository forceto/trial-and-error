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
	
	//java 7 �������﷨
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
		//��������Ҫ�ð�װ��
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
	
	//��������������
	private void SmallAppleTest(){
		SmallApple s=new SmallApple("smallApple...");
		System.out.println(s.getInfo());
	}
	
	//����ͨ���������
	private void upperBoundTest(){
		/*
		 * ������Shape
		 * CircleOfShape��RectangleOfShape��Shape������
		 * ShapeΪ<? extends Shape>��?�����Ϊ֪���͵�ͨ���   ����(upper bound)
		 * ����?������������Shape������
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

	//�ڶ�������ʱ�趨����
	private void typeParameterTest(){
		AppleOfTypeParameter<Float> a1=new AppleOfTypeParameter<>();
		a1.sum=1000f;
		System.out.println(a1.sum);
//		String ����Number�����࣬���б���
//		AppleOfTypeParameter<String> a2=new AppleOfTypeParameter<>();
	}
	
	//���巺�ͷ�������array���Ƶ�Collection
	public <T> void fromArrayToCollection(T[] a,Collection<T> c){
		for(T o:a){
			c.add((T) a);
		}
	}
	
	//ʹ�÷��ͷ���
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
		 * --------�Լ�����ķ���Ϊ׼----------
		 * ��Collection�еķ���Ϊ������ޣ���������ͱ��������������
		 */
		//T-->Object	sa-->String 	co-->Object
		//��ΪStringΪObject���������Կ���
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

		//na-->Number 	cs-->String		Number����StringҲ�������������Ա���
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




