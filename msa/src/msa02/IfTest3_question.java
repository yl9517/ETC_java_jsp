package msa02;

import java.util.Scanner;
/*
 * kor eng ��� 90�̻��̸� very good
 * ���� �ϳ��� 90�̻��̸� good
 * �Ѵ� 90�ȵǸ� bad
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
