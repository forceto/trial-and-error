package chapter8;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapTest {
	
	public MapTest(){
		hashMapTest();
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
}


