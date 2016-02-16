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
		useCopy();
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
		//ֱ�Ӵ���������Զ�ƥ������
		genericMethodTest2(apple, fruit);
		System.out.println("apple:"+apple);
		System.out.println("fruit:"+fruit);
	}
	
	private void use_Foo_GenericConstructorTest(){ 
		//��ʽָ�����͹������е�TΪString
		new Foo_GenericConstructorTest("Java");
		//��ʽָ�����͹������е�TΪInteger
		new Foo_GenericConstructorTest(200);
		
		/*
		 *��ʽָ�����͹������е�TΪString
		 *��ʾָ�������ͱ����봫������������һ�� 
		 */
		new <String> Foo_GenericConstructorTest("Java EE");
		
		/*
		 * ��ʾָ��������String�봫����������Double��һ�£��ʳ���
		 * new <String> Foo_GenericConstructorTest("123.23");
		 */
	}
	
	//self-practice generic method
	private <T extends Number> void green(T t){
		System.out.println(t);
	}
	
	private void useGreen(){
		green(new Integer(12312));
	}
	
	private void car(){
		Car_GenericClass<String> volvo=new Car_GenericClass<String>("volvo");
		System.out.println(volvo.getName());
		Car_GenericClass<Integer> audi=new Car_GenericClass<Integer>(0000);
		System.out.println(audi.getName());
		Car_GenericClass<Double> chery=new Car_GenericClass<Double>(23432.234);
		System.out.println(chery.getName());
		System.out.println("----------------------");
		Pc<Double> d=new Pc<>(1231.12312);
		Pc<Number> n=new Pc<>(12312.2f);
	}
	
	/*
	 * ͨ���������
	 * <? super T>  ?������������T��T�ĸ���
	 */
	private <T> T copy(Collection<? super T> dest , Collection<T> src){
		T last=null;
		for(T atom:src){
			last=atom;
			dest.add(atom);
		}
		return last;
	}
	
	private void useCopy(){
		//T-->Integer
		List<Number> ln=new ArrayList<>();
		List<Integer> li=new ArrayList<>();
		li.add(5);
		Integer last=copy(ln, li);
		System.out.println(last);
	}
	
	private <T> T copy2(Collection<T> dest, Collection<? extends T> src){
		T last=null;
		for(T atom:src){
			last=atom;
			dest.add(atom);
		}
		return last;
	}
	
	private void useCopy2(){
		List<Number> ln=new ArrayList<>();
		List<Integer> li=new ArrayList<>();
		li.add(32);
		//���Ͳ�ƥ�� lastΪNumber
		//Integer last=copy2(ln, li);
	}
}




