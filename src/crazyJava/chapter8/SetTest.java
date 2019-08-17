package crazyJava.chapter8;

import java.util.Comparator;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import crazyJava.chapter5.SeasonEnum;

public class SetTest {
	public SetTest() {
		EnumSetTest();
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
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
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
		
		System.out.println("r1=-3\tr2=5");
		TreeSet ts1=new TreeSet();
		ts1.add(new R(5));
		ts1.add(new R(-3));
		ts1.add(new R(9));
		ts1.add(new R(-2));
		System.out.println(ts1);
		
		//取出第一个元素
		R r1=(R)ts1.first();
		//改值
		r1.count=20;
		//取出最后一个元素
		R r2=(R)ts1.last();
		//该值
		r2.count=-2;
		
		System.out.println(ts1);
		//修改后，TreeSet不再自动排序。
		System.out.println(ts1.remove(new R(-2)));
		System.out.println(ts1.remove(new R(5)));
		System.out.println(ts1);
		System.out.println(ts1.remove(new R(-2)));
		System.out.println(ts1);
		System.out.println(ts1.add(new R(100)));
		System.out.println(ts1);
		
		
		//实现Comparator接口，进行自定义排序
		@SuppressWarnings("rawtypes")
		class DescendSort implements Comparator{

			//compare(a,b)类似于 a.compareTo(b)
			public int compare(Object o1, Object o2) {
				R r1=(R)o1;
				R r2=(R)o2;
				//总是从小到大输出，即return -1 的认为是小的
				return r1.count < r2.count ? 1:r1.count > r2.count? -1:0;
			}
			
		}
							//传入自定义排序规则
		TreeSet ts2=new TreeSet(new DescendSort() );
		ts2.add(new R(5));
		ts2.add(new R(-3));
		ts2.add(new R(9));
		ts2.add(new R(-2));
		System.out.println(ts2);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void EnumSetTest(){ 
		EnumSet set1=EnumSet.allOf(SeasonEnum.class);
		System.out.println(set1);
		//create empty set
		EnumSet set2=EnumSet.noneOf(SeasonEnum.class);
		System.out.println(set2);
		set2.add(SeasonEnum.WINTER);
		set2.add(SeasonEnum.FALL);
		System.out.println(set2);
		EnumSet set3=EnumSet.of(SeasonEnum.WINTER, SeasonEnum.SUMMER);
		System.out.println(set3);
		EnumSet set4=EnumSet.range(SeasonEnum.SUMMER, SeasonEnum.WINTER);
		System.out.println(set4);
		EnumSet set5=EnumSet.complementOf(set4);
		System.out.println(set5);
		
	}
	
}
/*
 * Set中性能最好：EnumSet，但只能存同一个枚举类的枚举值作为元素
 *整体性能   HashSet>TreeSet
 *增、查：HashSet
 *排序：TreeSet
 *遍历:LinkedHashSet
 * */
 