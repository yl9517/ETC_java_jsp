package msa12;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 이름:
 * 주민번호 : 900101-1010111
 * 			010101-4010111
 * 
 * =>이름 : 홍길동 
 * 	 생년월일 : 1990년도 01월 01일
 * 	 성별 : 남
 *   나이 : 31살 (2021-1990)
 *   
 * => 이름 : 홍길순
 *    생년월일 : 2001년도 01월 01일
 *    성별 : 여
 *    나이 : 20살
 * 
 */
//주민번호 받고 String 메소드 찾아서 생년월일로 변경
//캘린더 클래스로 현재 년도 찾아서 나이 구하기 
class Info{
	private String name;
	private String jumin;
	
	public Info(String name,String jumin) {
		this.name = name;
		this.jumin = jumin;
	}
	
	
	public String getName() {
		return name;
	}

	public String getJumin() {
		return jumin;
	}



	//성별
	public String gender(String firstNum) {
		String gender = "남자"; //기본 남자
		if(firstNum.equals("2") || firstNum.equals("4"))
			gender = "여자";
		return gender;
	}
	
	//연
	public String century(String jumin) {
		String firstNum = jumin.substring(7, 8);
		
		String year = "19".concat(jumin.substring(0, 2)); //기본 20세기
		
		if(firstNum.equals("3") || firstNum.equals("4")) //주민 뒷자리가 3혹은 4면 21세기
			year = "20".concat(jumin.substring(0, 2));
		return year;
	}
	
	//생일
	public String birth(String jumin) {
		String month = jumin.substring(2,4).concat("월 ");
		String day = jumin.substring(4,6).concat("일");
		
		return month+day;
	}
	
	//나이 (캘린더 클래스 사용하여)
	public int age(String year) {
		return Calendar.getInstance().get(Calendar.YEAR)-Integer.parseInt(year);
		
	}
}
public class question {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 :");
		String name = sc.next();
		System.out.print("주민번호 :");
		String jumin = sc.next();
		
		Info info = new Info(name, jumin); //객체 생성
			
		String gender = info.gender(jumin.substring(7, 8));		
		String year = info.century(jumin);
		String birth = info.birth(jumin);
		int age = info.age(year);
		
		System.out.println("이름 : "+info.getName());
		System.out.println("생년월일 : "+year.concat("년도 ").concat(birth));
		System.out.println("성별 : "+gender);
		System.out.println("나이 :"+age+"살");

	}

}
