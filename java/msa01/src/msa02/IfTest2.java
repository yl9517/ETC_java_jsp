package msa02;

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		//kor, eng �Է¹ޱ�
 		Scanner sc = new Scanner(System.in);
 		
 		System.out.print("kor : ");
 		int kor = sc.nextInt();	

 		System.out.print("eng : ");
 		int eng = sc.nextInt();
 		
 		if(kor>=90) {
 			if(eng>=90) 
 				System.out.println("kor 90�̻�, eng 90�̻�");
 			else 
 				System.out.println("kor 90�̻�, eng 90�̸�");
 		}
 		else {
 			if(eng>=90) 
 				System.out.println("kor 90�̸�, eng 90�̻�");
 			else
 				System.out.println("kor 90�̸�, eng 90�̸�");
 		}
 		
 		
	}

}
