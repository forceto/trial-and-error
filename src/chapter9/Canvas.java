package chapter9;

import java.util.List;
import java.util.Set;

public class Canvas {
	/*
	 * �����Ƶķ���ͨ���
	 * List<? extends Shape>
	 * δ֪������Shape������
	 */
	public void drawAll(List<? extends Shape> shapes){
		System.out.println("drallAll()....");
		for(Shape s:shapes){
			System.out.println("execute...forEach...List");
			s.draw(this);
		}
	}
	
	public void drawDiomand(Set<? extends Shape> xingzhuang){ 
		System.out.println("����ִ��drawDiomand()...");
		for(Shape s:xingzhuang){
			System.out.println(this.toString());
		}
	}
}
