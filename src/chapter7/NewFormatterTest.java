package chapter7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class NewFormatterTest {
	public NewFormatterTest(){
		isoDate();
	}
	private void book(){
		//jdk8 新增格式器  TimeDateFormatter()
		DateTimeFormatter[] formatters=new DateTimeFormatter[]{
				//使用常量创建DateTimeformatter格式器
				DateTimeFormatter.ISO_LOCAL_DATE,
				DateTimeFormatter.ISO_LOCAL_TIME,
				DateTimeFormatter.ISO_DATE_TIME,
				//使用本地化的不同风格创建DateTimeformatter格式器
				DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.LONG),
				DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG),
				//根据模式字符串创建DateTimeformatter格式器
				DateTimeFormatter.ofPattern("G yyyy MMM dd HH:mm:ss"),
		};
		LocalDateTime date=LocalDateTime.now();
		for(int i=0;i<formatters.length;i++){
			System.out.println(formatters[i].format(date));
		}
		
	}
	private void isoDate(){
		//建格式器
		DateTimeFormatter d=DateTimeFormatter.ISO_DATE;
		//创建对象
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		String str=d.format(ld);
		System.out.println(str);
	}
	
}
