package crazyJava.chapter7;

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
	private void newMethod(){ 
		// 取当前日期：
		LocalDate today=LocalDate.now();
		System.out.println(today);
		// 根据年月日取日期，12月就是12：
		LocalDate crischristmas = LocalDate.of(2014, 12, 25); // -> 2014-12-25
		// 根据字符串取：
		LocalDate endOfFeb = LocalDate.parse("2014-02-28"); // 严格按照ISO yyyy-MM-dd验证，02写成2都不行，当然也有一个重载方法允许自己定义格式
		//LocalDate.parse("2014-02-29");  无效日期无法通过：DateTimeParseException: Invalid date

		//日期转换经常遇到，比如：
		// 取本月第1天：
		LocalDate firstDayOfThisMonth = today.with(TemporalAdjusters.firstDayOfMonth()); // 2014-12-01
		System.out.println("本月第一天："+firstDayOfThisMonth);
		// 取本月第2天：
		LocalDate secondDayOfThisMonth = today.withDayOfMonth(2); // 2014-12-02
		// 取本月最后一天，再也不用计算是28，29，30还是31：
		LocalDate lastDayOfThisMonth = today.with(TemporalAdjusters.lastDayOfMonth()); // 2014-12-31
		// 取下一天：
		LocalDate firstDayOf2015 = lastDayOfThisMonth.plusDays(1); // 变成了2015-01-01
		// 取2015年1月第一个周一，这个计算用Calendar要死掉很多脑细胞：
		LocalDate firstMondayOf2015 = LocalDate.parse("2015-01-01").
				with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)); // 2015-01-05
	}
}
