package msa13;

import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name= sc.next();
		System.out.print("�ֹι�ȣ : ");
		String jumin= sc.next();
		
		String y = jumin.substring(0,2); //��
		String m = jumin.substring(2,4); //��
		String d = jumin.substring(4,6); //��
		String g = jumin.substring(7,8); //����
		
		String year ="20"+y;
		if(g.equals("1") || g.equals("2"))
			year ="19"+y;
		
		String gender ="����";
		if(g.equals("1") || g.equals("3"))
			gender="����";
		
		GregorianCalendar calendar = new GregorianCalendar();
		int age = calendar.get(Calendar.YEAR)-Integer.parseInt(year);
		
		System.out.println("�̸� : "+name);
		System.out.println("������� : "+year+"�⵵ "+m+"�� "+d+"��");
		System.out.println("���� : "+gender);
		System.out.println("���� : "+age);
		
	}

}
