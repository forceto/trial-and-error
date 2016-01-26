package chapter7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public SimpleDateFormatTest() throws ParseException {
		Date d=new Date();
		//����SimpleDateFormat����
		SimpleDateFormat sdf1=new SimpleDateFormat("Gyyyy���е���D");
		//��d��ʽ��Ϊ����
		String datestr=sdf1.format(d);
		System.out.println(datestr);
		String str="14###����##21";
		SimpleDateFormat sdf2=new SimpleDateFormat("y###MMM##d");
		System.out.println(sdf2.parse(str));
	}

}

