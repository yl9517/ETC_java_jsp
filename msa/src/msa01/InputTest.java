package msa01;

import java.util.Scanner;

/*
 * 		byte short int long float bouble
 * 			 char
 * 
 */
public class InputTest {

	public static void main(String[] args) {
		
		char a = 'a';
		System.out.println(a);
		
		int ch = a; 	//a라는 문자의 코드값 출력
		System.out.println(ch);
		
		String b ="abc";
		
		//---------------------입력받기------------------
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");	
		String name = sc.nextLine();
		
		System.out.print("국어 성적을 입력하세요 : ");	
		int korean = Integer.parseInt(sc.nextLine());
		
		System.out.print("영어 성적을 입력하세요 : ");	
		int engilsh = sc.nextInt();

		System.out.print("수학 성적을 입력하세요 : ");	
		int math = sc.nextInt();
		
		int total = korean+engilsh+math;
		float avg = (float)total/3;  //혹은    total/3.0f;
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+korean);
		System.out.println("영어 : "+engilsh);
		System.out.println("수학 : "+math);
		System.out.println("총점 : "+total);
		System.out.printf("평균 : %.1f\n ", avg);
		
		System.out.println("------합격 여부------");
		//평균점수가 60점 이상이면 합격 아니면 불합격을 출력하시오.
		if(avg>=60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
		

	}

}
