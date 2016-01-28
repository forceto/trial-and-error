package chapter8;

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
		
		TreeSet ts=new TreeSet();
		ts.add(new R(5));
		ts.add(new R(-3));
		ts.add(new R(9));
		ts.add(new R(-2));
		System.out.println(ts);
		//ȡ����һ��Ԫ��
		R r1=(R)ts.first();
		//��ֵ
		r1.count=20;
		//ȡ�����һ��Ԫ��
		R r2=(R)ts.last();
		//��ֵ
		r2.count=-2;
		
		System.out.println(ts);
		System.out.println(ts.remove(new R(-2)));
		System.out.println(ts.remove(new R(5)));
		System.out.println(ts);
		System.out.println(ts.remove(new R(-2)));
		System.out.println(ts);
		System.out.println(ts.add(new R(100)));
		System.out.println(ts);
		//�޸ĺ�TreeSet�����Զ�����
	}
}
