package msa02;

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		//kor, eng 입력받기
 		Scanner sc = new Scanner(System.in);
 		
 		System.out.print("kor : ");
 		int kor = sc.nextInt();	

 		System.out.print("eng : ");
 		int eng = sc.nextInt();
 		
 		if(kor>=90) {
 			if(eng>=90) 
 				System.out.println("kor 90이상, eng 90이상");
 			else 
 				System.out.println("kor 90이상, eng 90미만");
 		}
 		else {
 			if(eng>=90) 
 				System.out.println("kor 90미만, eng 90이상");
 			else
 				System.out.println("kor 90미만, eng 90미만");
 		}
 		
 		
	}

}
