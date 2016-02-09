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
		//add�������룬��ԭ���ڶ���λ���ϵ�Ԫ�غ���
		books.add(1, new String("ajax"));
		//����List����������
		for(int i=0;i<books.size();i++){
			System.out.println(books.get(i));
		}
		String a=(String)books.remove(2);
		System.out.println("remove:"+a);
		System.out.println(books);
		System.out.println("ajax index:"+books.indexOf(new String("ajax")));
		//�滻
		books.set(1, new String("java"));
		System.out.println("replace:"+books);
		//��ȡ����Χ��[,)   ����ҿ�
		System.out.println("cut:"+books.subList(0, 2));
		System.out.println();
		System.out.println("ListIterator������");
		//List��ȡListIterator������
		ListIterator lt=books.listIterator();
		while(lt.hasNext()){
			System.out.println(lt.next());
			//ListIterator�������ڵ����������ܲ���Ԫ��
			lt.add("------------");
		}
		System.out.println();
		//ListIterator�������ܷ������
		System.out.println("��ʼ�������...");
		while(lt.hasPrevious()){
			System.out.println(lt.previous());
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void LinkedListTest(){
		LinkedList book=new LinkedList();
		//һ��ˮƽ�Ķ��У�offer�Ǵ���������룬push�Ǵ������Ҳ��룬��ջ�����ұ�
		book.offer("java");
		book.push("java EE");
		book.offerFirst("android");
		book.push("jsp");
		book.offer("javaScript");
		System.out.println(book);
		//����������
		for(int i=0;i<book.size();i++){
			System.out.print(book.get(i)+",");
		}
		System.out.println();
		System.out.println("peekfirst-->\t"+book.peekFirst());
		System.out.println("peekLast-->\t"+book.peekLast());
		//pop
		System.out.println("pop-->\t"+book.pop());
		System.out.println("after pop:\t"+book);
		System.out.println("poll�����������һ��\t"+book.pollLast());
	}
}

