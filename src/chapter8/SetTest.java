package chapter8;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {
	public SetTest() {
		TreeSetObjectTest2();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void LinkedHashSetTest() {
		// LinkedHashSet按照插入顺序保存
		LinkedHashSet linkHash = new LinkedHashSet<>();
		// 增加元素
		linkHash.add("Link");
		linkHash.add("hash");
		System.out.println(linkHash);
		// 删除元素
		linkHash.remove("Link");
		System.out.println(linkHash);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void TreeSet_DefaultSort() {
		TreeSet tree = new TreeSet();
		// 自动装箱
		tree.add(12);
		tree.add(123);
		tree.add(34);
		tree.add(56);
		for (int i = 1; i < 40; i++) {
			if (i % 7 == 0)
				tree.add(i);
		}
		System.out.println("tree set:" + tree);
		// 取第一个元素
		System.out.println("first atom:" + tree.first());
		// 取最后一个元素
		System.out.println("last atom:" + tree.last());
		// 返回小于制定数值的集合
		System.out.println("小于40的数组成的集合：" + tree.headSet(40));
		// 返回大于等于指定数值的集合
		System.out.println("大于等于56的数组成的集合:" + tree.tailSet(56));
		System.out.println(tree);
		System.out.println("小于21的最大数：" + tree.lower(21));
		System.out.println("大于35的最小数:" + tree.higher(35));
	}

	//将对象放入TreeSet
	private void TreeSetObjectTest() {
		@SuppressWarnings("rawtypes")
		class Zoo implements Comparable{
			public int age;

		    Zoo(int age) {
				this.age = age;
			}

			public boolean equals(Object j) {
				return true;
			}
			
			//实现Comparable接口的compareTo（）方法
			public int compareTo(Object o) {
				return 1;
			}

		}
		TreeSet set=new TreeSet();
		Zoo z1=new Zoo(10);
		set.add(z1);
		System.out.println(set.add(z1));
		((Zoo)set.first()).age=1;
		System.out.println(((Zoo)set.last()).age);
		//当修改的set中第一个的age后，第二个的age也更改了，说明二者在内存中是同一个元素
	}
	
	private void TreeSetObjectTest2() {
		//程序修改了放入TreeSet中的对象的实例变量后，TreeSet不会再次调整顺序
		@SuppressWarnings("rawtypes")
		class R implements Comparable{
			int count;
			public R(int count){
				this.count=count;
			}
			
			public String toString(){
				return  "R:[count:"+count+"]";
			}
			
			public boolean equals(Object o){
				if(this==o){
					return true;
				}
				if(o!=null && o.getClass()==R.class){
					R r=(R)o;
					return r.count==this.count;
				}
				return false;
			}
			
			public int compareTo(Object o){
				R r=(R)o;
				return count>r.count? 1 : count<r.count? -1 : 0; 
			}
			
		}	
		
		TreeSet ts=new TreeSet();
		ts.add(new R(5));
		ts.add(new R(-3));
		ts.add(new R(9));
		ts.add(new R(-2));
		System.out.println(ts);
		//取出第一个元素
		R r1=(R)ts.first();
		//改值
		r1.count=20;
		//取出最后一个元素
		R r2=(R)ts.last();
		//该值
		r2.count=-2;
		
		System.out.println(ts);
		System.out.println(ts.remove(new R(-2)));
		System.out.println(ts.remove(new R(5)));
		System.out.println(ts);
		System.out.println(ts.remove(new R(-2)));
		System.out.println(ts);
		System.out.println(ts.add(new R(100)));
		System.out.println(ts);
		//修改后，TreeSet不再自动排序。
	}
}
