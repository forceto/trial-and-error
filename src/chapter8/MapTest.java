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
		//放入key-value对
		map.put("Java", 109);
		map.put("IOS",10);
		map.put("Ajax",79);
		map.put("Java EE", 99);
		System.out.println(map.put("IOS", 99));
		System.out.println(map);
		//判断是否包含指定的key
		System.out.println("key=IOS ?\t"+map.containsKey("IOS"));
		//判断是否包含指定的value
		System.out.println("value=99 ?\t"+map.containsValue(99));
		//获取key组成的集合，遍历
		for(Object key: map.keySet()){
			//get(key) 获取指定key的value
			System.out.println(key+"-->"+map.get(key));
		}
		System.out.println(map.remove("Ajax"));
		for(Object key:map.keySet()){
			System.out.println(key+"-->"+map.get(key));
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void hashMapTest(){
		//定义2个测试类
		
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


