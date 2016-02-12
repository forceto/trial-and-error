package chapter8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.WeakHashMap;


public class MapTest {
	
	public MapTest() throws Exception{
		enumMapTest();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void basicMap(){
		Map map=new HashMap();
		//����key-value��
		map.put("Java", 109);
		map.put("IOS",10);
		map.put("Ajax",79);
		map.put("Java EE", 99);
		System.out.println(map.put("IOS", 99));
		System.out.println(map);
		//�ж��Ƿ����ָ����key
		System.out.println("key=IOS ?\t"+map.containsKey("IOS"));
		//�ж��Ƿ����ָ����value
		System.out.println("value=99 ?\t"+map.containsValue(99));
		//��ȡkey��ɵļ��ϣ�����
		for(Object key: map.keySet()){
			//get(key) ��ȡָ��key��value
			System.out.println(key+"-->"+map.get(key));
		}
		System.out.println(map.remove("Ajax"));
		for(Object key:map.keySet()){
			System.out.println(key+"-->"+map.get(key));
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void hashMapTest(){
		//����2��������
		
		class A{
			int count;
			
			A(int count){
				this.count=count;
			}
			
			public boolean equals(Object obj){
				if(obj==this){
					return true;
				}
				if(obj != null && obj.getClass()==A.class){
					A a=(A)obj;
					return this.count==a.count;
				}
				return false;
			}
			
			public int hashCode(){
				return this.count;
			}
		}
		
		class B{
			public boolean equals(Object obj){
				return true;
			}
		}
		
		Hashtable h=new Hashtable();
		h.put(new A(60000), "java");
		h.put(new A(87563), "java EE");
		h.put(new A(1232), new B());
		System.out.println(h);
		System.out.println(h.containsValue("sdfa"));
		System.out.println();
		System.out.println(h.containsKey(new A(87563)));
	}
	
	private void propertiesTest() throws Exception{ 
		Properties pro=new Properties();
		pro.setProperty("username", "Lee");
		pro.setProperty("password", "123456");
		pro.store(new FileOutputStream("a.ini"), "comment lines");
		Properties p=new Properties();
		p.setProperty("gender", "male");
		p.load(new FileInputStream("a.ini"));
		System.out.println(p);
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void treeMapTest(){ 
		//���������     
		//treeMap ��Ȼ���򣬱���������ʵ��Comparable�ӿ�
		class R implements Comparable{
			
			int count;
			R(int count){
				this.count=count;
			}
			
			//����key�����
			public String toString(){
				return "R[count:"+count+"]";
			}
			
			@Override
			public int compareTo(Object o) {
				R r=(R)o;
				return count>r.count? 1:count<r.count? -1:0;
			}
			
		}
		
		TreeMap t=new TreeMap();
		t.put(new R(3), "java EE");
		t.put(new R(-5), "java");
		t.put(new R(9), "android");
		System.out.println(t); 
		
		//��������
		System.out.println("key��С�ļ�ֵ��-->"+t.firstEntry());
		System.out.println("key���ļ�ֵ��-->"+t.lastEntry());
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void weakHashMapTest(){
		 WeakHashMap weak=new WeakHashMap();
		 weak.put(new String("A"),new String("1"));
		 weak.put(new String("B"), new String("2"));
		 weak.put(new String("C"), new String("3"));
		 
		 weak.put("java", new String("4"));
		 System.out.println(weak);
		 System.gc();
		 System.runFinalization();
		 System.out.println(weak);
	}
	
	@SuppressWarnings({"rawtypes","unchecked"})
	private void identityHashMapTest(){
		IdentityHashMap i=new IdentityHashMap();
		/*
		 * ��IdentityHashMap�У�key֮�����==�����ϸ��ж�
		 * �����������ͱ�����==�Ƚϵ��Ƕ���ĵ�ַ
		 */
		i.put(new String("java1"), 1);
		i.put(new String("java2"), 2);
		i.put("java", 11);
		i.put("java", 22);
		System.out.println(i);
	}
	
	@SuppressWarnings({"rawtypes","unchecked"})
	private void enumMapTest(){
		/*
		 *����EnumMapʱ��ָ��һ��ö����
		 * key�����Ǹ�ö�����ֵ
		 * EnumMap�ڲ�����ö��ֵ��ö�����ж����˳������
		 */
		EnumMap e=new EnumMap(MonthTest.class);
		e.put(MonthTest.APRIL, "�˼����·���ѩ");
		e.put(MonthTest.AUGUST, "˪Ҷ���ڶ��»�");
		System.out.println(e);
	}
}


