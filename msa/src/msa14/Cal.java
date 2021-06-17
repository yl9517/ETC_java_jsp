package msa14;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Cal {

	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar();
		
		int year = cal.get(Calendar.YEAR); //��
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		int h = cal.get(Calendar.HOUR);  //(����) 2��
		int h2 = cal.get(Calendar.HOUR_OF_DAY); // 14��
		int m = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		
		int week =cal.get(Calendar.DAY_OF_WEEK); 
	
		
		int today = cal.get(Calendar.DAY_OF_YEAR);

		System.out.println("---------------------");
		System.out.print(year+".");
		System.out.print(month+".");
		System.out.println(day);
		System.out.print(h+":");
		System.out.print(m+":");
		System.out.println(s);
		
		switch(week) {
		case 1:
			System.out.println("�Ͽ���");
			break;
		case 2:
			System.out.println("������");
			break;
		case 3:
			System.out.println("ȭ����");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("�����");
			break;
		case 6:
			System.out.println("�ݿ���");
			break;
		case 7:
			System.out.println("�����");
			break;
			
		}
		System.out.println(today);
		
	}

}
