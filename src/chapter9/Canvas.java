package chapter9;

import java.util.List;
import java.util.Set;

public class Canvas {
	/*
	 * 被限制的泛型通配符
	 * List<? extends Shape>
	 * 未知类型是Shape的子类
	 */
	public void drawAll(List<? extends Shape> shapes){
		System.out.println("drallAll()....");
		for(Shape s:shapes){
			System.out.println("execute...forEach...List");
			s.draw(this);
		}
	}
	
	public void drawDiomand(Set<? extends Shape> xingzhuang){ 
		System.out.println("正在执行drawDiomand()...");
		for(Shape s:xingzhuang){
			System.out.println(this.toString());
		}
	}
}
