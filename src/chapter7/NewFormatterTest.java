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
		//jdk8 ������ʽ��  TimeDateFormatter()
		DateTimeFormatter[] formatters=new DateTimeFormatter[]{
				//ʹ�ó�������DateTimeformatter��ʽ��
				DateTimeFormatter.ISO_LOCAL_DATE,
				DateTimeFormatter.ISO_LOCAL_TIME,
				DateTimeFormatter.ISO_DATE_TIME,
				//ʹ�ñ��ػ��Ĳ�ͬ��񴴽�DateTimeformatter��ʽ��
				DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.LONG),
				DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG),
				//����ģʽ�ַ�������DateTimeformatter��ʽ��
				DateTimeFormatter.ofPattern("G yyyy MMM dd HH:mm:ss"),
		};
		LocalDateTime date=LocalDateTime.now();
		for(int i=0;i<formatters.length;i++){
			System.out.println(formatters[i].format(date));
		}
		
	}
	private void isoDate(){
		//����ʽ��
		DateTimeFormatter d=DateTimeFormatter.ISO_DATE;
		//��������
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		String str=d.format(ld);
		System.out.println(str);
	}
	
}
