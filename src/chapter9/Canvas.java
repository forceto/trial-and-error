package chapter9;

import java.util.List;

public class Canvas {
	/*
	 * 被限制的泛型通配符
	 * List<? extends Shape>
	 * 未知类型是Shape的子类
	 */
	public void drawAll(List<? extends Shape> shapes){
		for(Shape s:shapes){
			s.draw(this);
		}
	}
}
