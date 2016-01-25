package chapter7;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
	public NumberFormatTest() {
		double d=1234000.567;
		Locale[] locales={Locale.CHINA,Locale.JAPAN,Locale.GERMAN,Locale.US};
		NumberFormat[] nf=new NumberFormat[12];
		for(int i=0;i<locales.length;i++){
//			通用数值格式器
			nf[i*3]=NumberFormat.getNumberInstance(locales[i]);
//			百分数各时期
			nf[i*3+1]=NumberFormat.getPercentInstance(locales[i]);
//			货币格式器
			nf[i*3+2]=NumberFormat.getCurrencyInstance(locales[i]);                             
		}
		for(int i=0;i<1;i++){
//			连续判断
//          三目运算符 (表达式1)?(表达式2):(表达式3)，
//			计算方法是这样的：表达式1是一个逻辑表达式，
//			如果其值为true，
//			则整个表达式的值为表达式2的值，
//			否则为表达式3的值						
			String tip= i==0 ? "-----中国的格式-----":
				i==1 ? "----日本的格式----":
					i==2 ? "----德国的格式----":"----美国的格式----";
			System.out.println(tip);
			System.out.println("通用数据格式："+nf[i*3].format(d));
			System.out.println("百分比数据格式："+nf[i*3+1].format(d));
			System.out.println("货币数据格式："+nf[i*3+2].format(d));
			
		}
		
	}
}
