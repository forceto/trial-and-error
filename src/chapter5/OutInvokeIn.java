package chapter5;

import chapter5.StaticInnerClass;

public class OutInvokeIn {
	public OutInvokeIn(){
		//�����ڲ���
		//��⣺�ڲ���������ⲿ����
		StaticInnerClass.In i=new StaticInnerClass().new In("hello");
	}
}
