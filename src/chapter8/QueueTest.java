package chapter8;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueTest {
	public QueueTest(){
		ArrayDequeStack();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void priorityQueueTest(){
		PriorityQueue pq=new PriorityQueue();
		//�ڶ�β����Ԫ��
		pq.offer(6);
		pq.offer(-3);
		pq.offer(20);
		pq.offer(18);
		System.out.println(pq+"\t\tsize:"+pq.size());
		Iterator it=pq.iterator();
		while(it.hasNext()){
			System.out.println(pq.poll());
		}
		System.out.println(pq.size());
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void ArrayDequeStack(){
		//��˫�˶���arrayDeque����ջʹ��
		ArrayDeque stack=new ArrayDeque();
		//push ѹջ
		stack.push("java");
		stack.push("java EE");
		stack.push("android");
		//push��ȥ�ģ�ջ��Ϊ����ͷ
		System.out.println("push--\t"+stack);
		System.out.println("peek-->\t"+stack.peek());
		//pop ��ջ
		System.out.println("pop-->\t"+stack.pop());
		System.out.println(stack);
		
		System.out.println("--------------");
		
		ArrayDeque queue=new ArrayDeque();
		queue.offer("java");
		queue.offer("Java EE");
		queue.offer("android");
		System.out.println("offer-->\t"+queue);
		//����  peek ֻȡ��ɾ
		System.out.println("peek-->\t"+queue.peek());
		System.out.println(queue);
		//����  poll ȡ��ɾ��
		System.out.println("poll-->\t"+queue.poll());
		System.out.println(queue);
		
		ArrayDeque a=new ArrayDeque();
		a.push(1);
		a.push(2);
		a.push(3);
		a.push(4);
		a.push(5);
		//push��ȥ�ģ�ջ��Ϊ����ͷ
		//��pushѹջ������ջ���
		System.out.println("push-->\t"+a);
		
		ArrayDeque s=new ArrayDeque();
		s.offer(1);
		s.offer(2);
		s.offer(3);
		s.offer(4);
		s.offer(5);
		//��offer��ӣ����ն������
		System.out.println("offer-->\t"+s);
	}
}
