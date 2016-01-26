package chapter7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NewFormatterParse {
	public NewFormatterParse() {

	}

	private void selfTry() {
		String s = "2000!!12!!23!! 23@12@12@";
		DateTimeFormatter datef = DateTimeFormatter.ofPattern("yyyy!!MMM!!dd HH@mm@ss@");
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
}
