package msa11;

import java.util.Scanner;

public class MemberTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MemberPro mp = new MemberPro();
		
		
		for(int i=0; i<10; i++) {
			System.out.print("�̸� : ");
			String name = sc.next();
			System.out.print("���� : ");
			int kor = sc.nextInt();
			System.out.print("���� : ");
			int eng = sc.nextInt();
			
			
			System.out.println("��� �Է�?");
			int num = sc.nextInt();
			
			if(num == 0)
				break;
		}
	}

}
