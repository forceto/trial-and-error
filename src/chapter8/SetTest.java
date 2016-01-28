package chapter8;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {
	public SetTest() {
		TreeSetObjectTest2();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void LinkedHashSetTest() {
		// LinkedHashSet���ղ���˳�򱣴�
		LinkedHashSet linkHash = new LinkedHashSet<>();
		// ����Ԫ��
		linkHash.add("Link");
		linkHash.add("hash");
		System.out.println(linkHash);
		// ɾ��Ԫ��
		linkHash.remove("Link");
		System.out.println(linkHash);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void TreeSet_DefaultSort() {
		TreeSet tree = new TreeSet();
		// �Զ�װ��
		tree.add(12);
		tree.add(123);
		tree.add(34);
		tree.add(56);
		for (int i = 1; i < 40; i++) {
			if (i % 7 == 0)
				tree.add(i);
		}
		System.out.println("tree set:" + tree);
		// ȡ��һ��Ԫ��
		System.out.println("first atom:" + tree.first());
		// ȡ���һ��Ԫ��
		System.out.println("last atom:" + tree.last());
		// ����С���ƶ���ֵ�ļ���
		System.out.println("С��40������ɵļ��ϣ�" + tree.headSet(40));
		// ���ش��ڵ���ָ����ֵ�ļ���
		System.out.println("���ڵ���56������ɵļ���:" + tree.tailSet(56));
		System.out.println(tree);
		System.out.println("С��21���������" + tree.lower(21));
		System.out.println("����35����С��:" + tree.higher(35));
	}

	//���������TreeSet
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
			
			//ʵ��Comparable�ӿڵ�compareTo��������
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
		//���޸ĵ�set�е�һ����age�󣬵ڶ�����ageҲ�����ˣ�˵���������ڴ�����ͬһ��Ԫ��
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void TreeSetObjectTest2() {
		//�����޸��˷���TreeSet�еĶ����ʵ��������TreeSet�����ٴε���˳��
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
		
		//ȡ����һ��Ԫ��
		R r1=(R)ts1.first();
		//��ֵ
		r1.count=20;
		//ȡ�����һ��Ԫ��
		R r2=(R)ts1.last();
		//��ֵ
		r2.count=-2;
		
		System.out.println(ts1);
		//�޸ĺ�TreeSet�����Զ�����
		System.out.println(ts1.remove(new R(-2)));
		System.out.println(ts1.remove(new R(5)));
		System.out.println(ts1);
		System.out.println(ts1.remove(new R(-2)));
		System.out.println(ts1);
		System.out.println(ts1.add(new R(100)));
		System.out.println(ts1);
		
		
		//ʵ��Comparator�ӿڣ������Զ�������
		@SuppressWarnings("rawtypes")
		class DescendSort implements Comparator{

			//compare(a,b)������ a.compareTo(b)
			public int compare(Object o1, Object o2) {
				R r1=(R)o1;
				R r2=(R)o2;
				//���Ǵ�С�����������return -1 ����Ϊ��С��
				return r1.count < r2.count ? 1:r1.count > r2.count? -1:0;
			}
			
		}
								//�����Զ����������
		TreeSet ts2=new TreeSet(new DescendSort() );
		ts2.add(new R(5));
		ts2.add(new R(-3));
		ts2.add(new R(9));
		ts2.add(new R(-2));
		System.out.println(ts2);
	}
	
	
}
