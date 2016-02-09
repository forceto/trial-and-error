package chapter8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListTest {
	public ListTest(){
		LinkedListTest();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void basicList(){
		java.util.List books=new ArrayList();
		books.add(new String("Java EE"));
		books.add(new String("java"));
		books.add(new String("android"));
		System.out.println(books);
		//add（）插入，将原来第二个位置上的元素后移
		books.add(1, new String("ajax"));
		//利用List的索引遍历
		for(int i=0;i<books.size();i++){
			System.out.println(books.get(i));
		}
		String a=(String)books.remove(2);
		System.out.println("remove:"+a);
		System.out.println(books);
		System.out.println("ajax index:"+books.indexOf(new String("ajax")));
		//替换
		books.set(1, new String("java"));
		System.out.println("replace:"+books);
		//截取，范围：[,)   左闭右开
		System.out.println("cut:"+books.subList(0, 2));
		System.out.println();
		System.out.println("ListIterator迭代器");
		//List获取ListIterator迭代器
		ListIterator lt=books.listIterator();
		while(lt.hasNext()){
			System.out.println(lt.next());
			//ListIterator迭代器在迭代过程中能插入元素
			lt.add("------------");
		}
		System.out.println();
		//ListIterator迭代器能反向迭代
		System.out.println("开始反向迭代...");
		while(lt.hasPrevious()){
			System.out.println(lt.previous());
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void LinkedListTest(){
		LinkedList book=new LinkedList();
		//一个水平的队列，offer是从右往左插入，push是从左往右插入，即栈顶在右边
		book.offer("java");
		book.push("java EE");
		book.offerFirst("android");
		book.push("jsp");
		book.offer("javaScript");
		System.out.println(book);
		//用索引遍历
		for(int i=0;i<book.size();i++){
			System.out.print(book.get(i)+",");
		}
		System.out.println();
		System.out.println("peekfirst-->\t"+book.peekFirst());
		System.out.println("peekLast-->\t"+book.peekLast());
		//pop
		System.out.println("pop-->\t"+book.pop());
		System.out.println("after pop:\t"+book);
		System.out.println("poll掉队列中最后一个\t"+book.pollLast());
	}
}

