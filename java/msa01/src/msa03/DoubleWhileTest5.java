package msa03;

import java.util.Scanner;

/*

이름,국,영,수 점수 입력받아
총점, 평균, 랭크 출력


 */
public class DoubleWhileTest5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int tot=kor+eng+math;
		float avg=(float)tot/3;
		String rank="";
		
		if(avg>=90)
			rank="수";
		else if(avg>=80)
			rank="우";
		else if(avg>=70)
			rank="미";
		else if(avg>=60)
			rank="양";
		else
			rank="가";
			
		System.out.println("===결과===");
		System.out.println("이름 : "+name);
		System.out.println("총점 : "+tot);
		System.out.printf("평균 : %.1f\n",avg);
		System.out.println("성취도 : "+rank);

	}

}
