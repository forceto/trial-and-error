package chapter7;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
	public NumberFormatTest() {
		double d=1234000.567;
		Locale[] locales={Locale.CHINA,Locale.JAPAN,Locale.GERMAN,Locale.US};
		NumberFormat[] nf=new NumberFormat[12];
		for(int i=0;i<locales.length;i++){
//			ͨ����ֵ��ʽ��
			nf[i*3]=NumberFormat.getNumberInstance(locales[i]);
//			�ٷ�����ʱ��
			nf[i*3+1]=NumberFormat.getPercentInstance(locales[i]);
//			���Ҹ�ʽ��
			nf[i*3+2]=NumberFormat.getCurrencyInstance(locales[i]);                             
		}
		for(int i=0;i<1;i++){
//			�����ж�
//          ��Ŀ����� (���ʽ1)?(���ʽ2):(���ʽ3)��
//			���㷽���������ģ����ʽ1��һ���߼����ʽ��
//			�����ֵΪtrue��
//			���������ʽ��ֵΪ���ʽ2��ֵ��
//			����Ϊ���ʽ3��ֵ						
			String tip= i==0 ? "-----�й��ĸ�ʽ-----":
				i==1 ? "----�ձ��ĸ�ʽ----":
					i==2 ? "----�¹��ĸ�ʽ----":"----�����ĸ�ʽ----";
			System.out.println(tip);
			System.out.println("ͨ�����ݸ�ʽ��"+nf[i*3].format(d));
			System.out.println("�ٷֱ����ݸ�ʽ��"+nf[i*3+1].format(d));
			System.out.println("�������ݸ�ʽ��"+nf[i*3+2].format(d));
			
		}
		
	}
}
