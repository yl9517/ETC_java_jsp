package msa10;
/*
 * Main에서 구현한 배열을 이용한 성적관리 프로그램을 memberPro에서 하도록 프로그램을 변경하라.
 * 
 * 힌트 : main에서 작성된 소스를 보고 기능별로 구분하여 각 메서드를 만들어서 구분하도록 한다.
 * dto : 인스턴스변수, getter,setter ...
 * 
 * 
 * 최대 10개까지만 받기
 * [입력]
 * 이름
 * 국어
 * 영어
 * 계속 입력(0:break  1:계속입력)
 * 
 * [출력] (총점기준 내림차 정렬)
 * 이름 국어 영어 총점 평균
 * .. .. .. .. ..
 * 
 */

import java.util.Scanner;

class MemberDTO{
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private float avg;
	
	public MemberDTO(String name,int kor,int eng, int tot, float avg) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.tot = tot;
		this.avg = avg;
	}
	
}

class MemberPro{
	private MemberDTO[] arr = new MemberDTO[10];
	//객체를 추가하고 정렬하고 출력하는 각각의 메소드를 구현
	
}
public class question {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //main에서 객체를 입력하도록
		//memberPro에서 구현한 메소드를 호출하여 출력
		for(int i=0; i<10; i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			
		}

	}

}
