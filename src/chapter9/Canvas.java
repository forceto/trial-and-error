package chapter9;

import java.util.List;

public class Canvas {
	/*
	 * �����Ƶķ���ͨ���
	 * List<? extends Shape>
	 * δ֪������Shape������
	 */
	public void drawAll(List<? extends Shape> shapes){
		for(Shape s:shapes){
			s.draw(this);
		}
	}
}
