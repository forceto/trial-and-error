package crazyJava.chapter7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public SimpleDateFormatTest() throws ParseException {
		Date d=new Date();
		//创建SimpleDateFormat对象
		SimpleDateFormat sdf1=new SimpleDateFormat("Gyyyy年中第天D");
		//将d格式化为日期
		String datestr=sdf1.format(d);
		System.out.println(datestr);
		String str="14###三月##21";
		SimpleDateFormat sdf2=new SimpleDateFormat("y###MMM##d");
		System.out.println(sdf2.parse(str));
	}

}

