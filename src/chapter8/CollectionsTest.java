package chapter8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsTest {
	public CollectionsTest(){
		listCollectionTest();
	}
	
	@SuppressWarnings({"rawtypes","unchecked"})
	private void listCollectionTest(){
		//List 有序，按照插入顺序
		ArrayList a=new ArrayList();
		a.add(2);
		a.add(-5);
		a.add(3);
		a.add(0);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println("倒置List...\t"+a);
		Collections.sort(a);
		System.out.println("对List进行默认排序（递增）...\t"+a);
		Collections.shuffle(a); 
		System.out.println("打乱List的顺序（shuffle译为:洗牌）...\t"+a);
		System.out.println("输出最大值：\t"+Collections.max(a)); 
		System.out.println("输出最小值：\t"+Collections.min(a));
		System.out.println("将0替换为99\t"+Collections.replaceAll(a, 0, 99));
		System.out.println(a);
		Collections.sort(a);
		System.out.println("按递增重排List。。。\t"+a);
		//只用排序后的List才能用二分查找,binarySearch()获得索引
		System.out.println(Collections.binarySearch(a, 3));
	}
	
	//不可变集合
	@SuppressWarnings({"rawtypes","unchecked"})
	private void unmodifiableTest(){
		
		//空的、不可变的List
		List unmod=Collections.emptyList();
		//只有一个元素、不可变的Set
		Set unmodSet=Collections.singleton("Java");
//		unmodSet.add("hello");
		
		Map m=new HashMap();
		m.put("Java", 1);
		m.put("Java EE", 2);
		m.put("android", 3);
		//返回Map对象的不可变版本 ,即视图（只读模式）
		Map unmodMap=Collections.unmodifiableMap(m); 
		
//	unmodMap.put("lol", 100);       改行无法执行                  
	}
}

