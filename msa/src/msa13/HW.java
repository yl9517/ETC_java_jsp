package msa13;

import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name= sc.next();
		System.out.print("주민번호 : ");
		String jumin= sc.next();
		
		String y = jumin.substring(0,2); //연
		String m = jumin.substring(2,4); //월
		String d = jumin.substring(4,6); //일
		String g = jumin.substring(7,8); //성별
		
		String year ="20"+y;
		if(g.equals("1") || g.equals("2"))
			year ="19"+y;
		
		String gender ="여자";
		if(g.equals("1") || g.equals("3"))
			gender="남자";
		
		GregorianCalendar calendar = new GregorianCalendar();
		int age = calendar.get(Calendar.YEAR)-Integer.parseInt(year);
		
		System.out.println("이름 : "+name);
		System.out.println("생년월일 : "+year+"년도 "+m+"월 "+d+"일");
		System.out.println("성별 : "+gender);
		System.out.println("나이 : "+age);
		
	}

}
