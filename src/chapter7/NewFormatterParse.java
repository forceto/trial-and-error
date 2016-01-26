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
		// 定义任意格式日期时间字符串
		String str1 = "2014==04==12 01时06分09秒";
		// 定义解析所用的格式器的格式
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern(
			// 严格区分大小写，否则报错。
			// 月份和时 是大写，即：MM 和 HH
			// 其他小写
			"yyyy==MM==dd HH时mm分ss秒");
		// 执行解析------------------------------字符串----格式器----
		LocalDateTime dt1 = LocalDateTime.parse(str1, formatter1);
		System.out.println(dt1);
		String str2 = "2342$$$四月$$$13 20小时";
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy$$$MMM$$$dd HH小时");
		LocalDateTime ld2 = LocalDateTime.parse(str2, dtf2);
		System.out.println(ld2);
	}
}
