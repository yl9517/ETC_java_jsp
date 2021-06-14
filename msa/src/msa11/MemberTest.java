package msa11;

import java.util.Scanner;

public class MemberTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MemberPro mp = new MemberPro();
		
		
		for(int i=0; i<10; i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			
			
			System.out.println("계속 입력?");
			int num = sc.nextInt();
			
			if(num == 0)
				break;
		}
	}

}
