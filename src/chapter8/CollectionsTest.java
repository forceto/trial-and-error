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
		//List ���򣬰��ղ���˳��
		ArrayList a=new ArrayList();
		a.add(2);
		a.add(-5);
		a.add(3);
		a.add(0);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println("����List...\t"+a);
		Collections.sort(a);
		System.out.println("��List����Ĭ�����򣨵�����...\t"+a);
		Collections.shuffle(a); 
		System.out.println("����List��˳��shuffle��Ϊ:ϴ�ƣ�...\t"+a);
		System.out.println("������ֵ��\t"+Collections.max(a)); 
		System.out.println("�����Сֵ��\t"+Collections.min(a));
		System.out.println("��0�滻Ϊ99\t"+Collections.replaceAll(a, 0, 99));
		System.out.println(a);
		Collections.sort(a);
		System.out.println("����������List������\t"+a);
		//ֻ��������List�����ö��ֲ���,binarySearch()�������
		System.out.println(Collections.binarySearch(a, 3));
	}
	
	//���ɱ伯��
	@SuppressWarnings({"rawtypes","unchecked"})
	private void unmodifiableTest(){
		
		//�յġ����ɱ��List
		List unmod=Collections.emptyList();
		//ֻ��һ��Ԫ�ء����ɱ��Set
		Set unmodSet=Collections.singleton("Java");
//		unmodSet.add("hello");
		
		Map m=new HashMap();
		m.put("Java", 1);
		m.put("Java EE", 2);
		m.put("android", 3);
		//����Map����Ĳ��ɱ�汾 ,����ͼ��ֻ��ģʽ��
		Map unmodMap=Collections.unmodifiableMap(m); 
		
//	unmodMap.put("lol", 100);       �����޷�ִ��                  
	}
}

