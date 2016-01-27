package chapter8;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
	public CollectionTest(){
		test();
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void test(){
		Collection c=new ArrayList();
		c.add("wukong");
		c.add(6);
		System.out.println(c.size());
		c.remove(6);
		System.out.println(c.size());
		System.out.print("是否contain wukong\t");
		if(c.contains("wukong"))
			System.out.println("是");
		else
			System.out.println("否");
		boolean bool=c.contains("wokong");
		c.add("添加元素中。。。");
		Collection d=new ArrayList();
		d.add(1);
		d.add(2);
		d.add(3);
		d.add(4);
		System.out.println("d size:"+d.size());
		System.out.println("c size:"+c.size());
		c.addAll(d);
		System.out.println(c.size());
		Collection qq=new ArrayList();
		Collection ww=new ArrayList();
		Collection ee=new ArrayList();
		Collection rr=new ArrayList();
		
		qq.add("q1");
		qq.add("q2");
		qq.add("q3");
		qq.add("q4");
		qq.add("w1");
		qq.add("common");
		
		ww.add("w1");
		ww.add("w2");
		ww.add("w3");
		ww.add("w4");
		ww.add("e1");
		ww.add("common");
		
		ee.add("e1");
		ee.add("e2");
		ee.add("e3");
		ee.add("e4");
		ee.add("q1");
		ee.add("common");
		
		rr.add("common");
		rr.add("q1");
		rr.add("w1");
		rr.add("e1");
		
		System.out.println("initial \tqq.size="+qq.size()+"\t"+
						   "ww.size="+ww.size()+"\t"+
						   "ee.size="+ee.size()+"\t"+
						   "rr.size="+rr.size());
		                //转义字符  双引号 用  \"
		System.out.println("qq contains \"w1\"?\t"+qq.contains("w1"));
		System.out.println("ww contains \"e1\"?\t"+ww.contains("e1"));
		System.out.println("ee contains \"q1\"?\t"+ee.contains("q1"));
		qq.addAll(rr);
		System.out.println("qq.size="+qq.size());
		System.out.print("qq与ee取交集-->"); 
		String s= qq.retainAll(ee)?"完成":"出错";
		System.out.println(s);
		System.out.println();
		System.out.println();
		qq.addAll(ee);
		qq.addAll(c);
		System.out.println("qq atom:");
		qq.forEach(obj->System.out.println(obj));
		System.out.println("-----------------------");
		System.out.println("交集");
		System.out.println(qq.size()+"\t"+c.size());
		qq.retainAll(c);
		System.out.println(qq.size());
		
		System.out.println("并集"); 
		System.out.println(qq.size()+"\t"+ee.size());
		qq.addAll(ee);
		System.out.println(qq.size());
		
		System.out.println("减去");
		System.out.println(qq.size()+"\t"+rr.size());
		qq.removeAll(rr);
		System.out.println(qq.size());
		
		System.out.println("清空");
		qq.clear();
		System.out.println(qq.size());
	}
}
