package chapter7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class NewFormatterParse {
	public NewFormatterParse() {
		newMethod();
	}

	private void selfTry() {
		String s = "2000!!12!!23 23@12@12@";
		DateTimeFormatter datef = DateTimeFormatter.ofPattern(
				"yyyy!!MM!!dd HH@mm@ss@");
		LocalDateTime time = LocalDateTime.parse(s, datef);
		System.out.println(time);
	}

	private void copyBook() {
		// ���������ʽ����ʱ���ַ���
		String str1 = "2014==04==12 01ʱ06��09��";
		// ����������õĸ�ʽ���ĸ�ʽ
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern(
			// �ϸ����ִ�Сд�����򱨴�
			// �·ݺ�ʱ �Ǵ�д������MM �� HH
			// ����Сд
			"yyyy==MM==dd HHʱmm��ss��");
		// ִ�н���------------------------------�ַ���----��ʽ��----
		LocalDateTime dt1 = LocalDateTime.parse(str1, formatter1);
		System.out.println(dt1);
		String str2 = "2342$$$����$$$13 20Сʱ";
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy$$$MMM$$$dd HHСʱ");
		LocalDateTime ld2 = LocalDateTime.parse(str2, dtf2);
		System.out.println(ld2);
	}
	private void newMethod(){ 
		// ȡ��ǰ���ڣ�
		LocalDate today=LocalDate.now();
		System.out.println(today);
		// ����������ȡ���ڣ�12�¾���12��
		LocalDate crischristmas = LocalDate.of(2014, 12, 25); // -> 2014-12-25
		// �����ַ���ȡ��
		LocalDate endOfFeb = LocalDate.parse("2014-02-28"); // �ϸ���ISO yyyy-MM-dd��֤��02д��2�����У���ȻҲ��һ�����ط��������Լ������ʽ
		//LocalDate.parse("2014-02-29");  ��Ч�����޷�ͨ����DateTimeParseException: Invalid date

		//����ת���������������磺
		// ȡ���µ�1�죺
		LocalDate firstDayOfThisMonth = today.with(TemporalAdjusters.firstDayOfMonth()); // 2014-12-01
		System.out.println("���µ�һ�죺"+firstDayOfThisMonth);
		// ȡ���µ�2�죺
		LocalDate secondDayOfThisMonth = today.withDayOfMonth(2); // 2014-12-02
		// ȡ�������һ�죬��Ҳ���ü�����28��29��30����31��
		LocalDate lastDayOfThisMonth = today.with(TemporalAdjusters.lastDayOfMonth()); // 2014-12-31
		// ȡ��һ�죺
		LocalDate firstDayOf2015 = lastDayOfThisMonth.plusDays(1); // �����2015-01-01
		// ȡ2015��1�µ�һ����һ�����������CalendarҪ�����ܶ���ϸ����
		LocalDate firstMondayOf2015 = LocalDate.parse("2015-01-01").
				with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)); // 2015-01-05
	}
}
