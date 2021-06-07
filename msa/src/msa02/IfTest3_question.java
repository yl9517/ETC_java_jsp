package msa02;

import java.util.Scanner;
/*
 * kor eng 모두 90이상이면 very good
 * 둘중 하나라도 90이상이면 good
 * 둘다 90안되면 bad
 * 
 */
public class IfTest3_question {

	public static void main(String[] args) {

 		Scanner sc = new Scanner(System.in);

 		System.out.print("kor : ");
 		int kor = sc.nextInt();	

 		System.out.print("eng : ");
 		int eng = sc.nextInt();
 		
 		
 		if(kor>=90 && eng>=90)
 			System.out.println("very good");
 		else if(kor>=90 || eng>=90)
 			System.out.println("good");
 		else
 			System.out.println("bad");
 		
	}

}
