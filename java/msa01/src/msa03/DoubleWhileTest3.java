package msa03;

import java.util.Scanner;

public class DoubleWhileTest3 {

	public static void main(String[] args) {

	/*
		
		*
		**
		***
		****

	 */
		//for��
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		//while��
		int i=1;
		while(i<=4) {
			
			int j=1;
			while(j<=i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		
		System.out.println();
		
		
		//�Է¹޾� for��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		
		if(num<=0) 
			System.out.println("[�Է� ����]");
		else {
			for(i=1; i<=num; i++) {
				
				for(int j=1; j<=i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
		System.out.println();
		
		//�Ųٷ� ���
//		
//		for(i=1; i<=5; i++) {
//			for(int s=5; s>=1; s--) {
//				if(s>i) 
//					System.out.print("  ");
//				
//				else 
//					System.out.print(" *");
//				
//			}
//			System.out.println();
//		}
	}

}
