package msa02;

import java.util.Scanner;

/*  switch��   
 * 	switch���� ��쿡�� �񱳿��� �� ���X
 * 
 * */
public class SwtichTest3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�");
		
		int score = sc.nextInt();
		
		score/=10;
		
		switch(score) {
		
		case 10 :
		case 9 :
			System.out.print("��");
			break;
		case 8 :
			System.out.print("��");
			break;
		case 7 :
			System.out.print("��");
			break;
		case 6 :
			System.out.print("��");
			break;
		default :
			System.out.print("��");
		}
		

	}

}
