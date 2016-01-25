package chapter7;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

public class TimeTest {
	public TimeTest(){
		//-------clock example---------
		Clock clock=Clock.systemUTC();
		System.out.println("time now:\t"+clock.instant());
		System.out.println(clock.millis());
		System.out.println(System.currentTimeMillis());
		//-------Duration example--------
		Duration d=Duration.ofSeconds(6000);
		System.out.println("6000���൱��"+d.toMinutes()+"��");
		System.out.println("6000���൱��"+d.toHours()+"Сʱ");
		System.out.println("6000���൱��"+d.toDays()+"��");
		Clock clock2=Clock.offset(clock, d);
		System.out.println("��ǰʱ���6000���Ϊ��\t"+clock2.instant());
		//--------Instant example--------
		//get current time
		System.out.println("----------------Instant example-------------");
		Instant instant=Instant.now();
		System.out.println(instant);
		//instant ��6000��
		Instant ins2=instant.plusSeconds(6000);
		System.out.println(ins2);
		//�����ַ�������Instant����
		Instant ins3=Instant.parse("2018-02-12T12:23:12.343Z");
		System.out.println(ins3);
		Instant ins4=ins3.plus(Duration.ofHours(5).plusMinutes(4));
		System.out.println(ins4);
		System.out.println("---------LocalDate example-------");
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		ld=LocalDate.ofYearDay(2014, 146);
		System.out.println(ld);
		ld=LocalDate.of(2014, Month.MAY,21);
		System.out.println(ld);
		LocalDate l=LocalDate.now();
		l=LocalDate.of(2014, 5, 21);
		System.out.println(l);
		System.out.println("-------LocalTime example----------");
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		lt=LocalTime.of(22, 33);
		System.out.println(lt);
		System.out.print("���ص�86003����ʲôʱ��-->");
		lt=LocalTime.ofSecondOfDay(86003);
		System.out.println(lt);
		System.out.println("----------LocalDateTime example-------");
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println("��ǰʱ��---------------->"+ldt);
		System.out.print("��ǰʱ�����25Сʱ3�ֱ��-->");
		LocalDateTime future=ldt.plusHours(25).plusMinutes(3);
		System.out.println(future);
		System.out.println("-------Year YearMonth MonthDay example---------");
		Year year=Year.now();
		System.out.println(year);
		year=year.plusYears(5);
		System.out.println("��ǰ��ݼ�5Ϊ"+year);
		System.out.print("ͨ���ƶ��·ݻ�ȡYearMonth����");
		YearMonth ym=year.atMonth(10);
		System.out.println(ym);
		System.out.print("��ǰ���5���2��");
		ym=ym.plusYears(5).minusMonths(2);
		System.out.println(ym);
		MonthDay md=MonthDay.now();
		System.out.println(md);
		System.out.print("��Ϊ5��23��");
		MonthDay m=md.with(Month.MAY).withDayOfMonth(23);
		System.out.println(m);
		
	}
}
