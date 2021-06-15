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

public class question {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 :");
		String name = sc.next();
		System.out.print("주민번호 :");
		String num = sc.next();
		
		String genderNum = num.substring(7, 8);
		
		String year = "19".concat(num.substring(0, 2)); //기본 20세기
		String month = num.substring(2,4);
		String day = num.substring(4,6);
		
		String gender = "남"; //기본 남
		
		
		//20세기 여자
		if(genderNum.equals("2"))  //여자
				gender ="여";		
		//21세기 + 여,남 구별
		else if(genderNum.equals("3")) { //21세기 남자,여자
			year = "20".concat(num.substring(0, 2));
			
			if(genderNum.equals("4")) 
				gender ="여";			
		}
	
		
	}

}
