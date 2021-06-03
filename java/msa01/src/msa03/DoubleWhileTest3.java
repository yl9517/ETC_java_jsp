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
		//for문
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		//while문
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
		
		
		//입력받아 for문
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		
		if(num<=0) 
			System.out.println("[입력 오류]");
		else {
			for(i=1; i<=num; i++) {
				
				for(int j=1; j<=i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
		System.out.println();
		
		//거꾸로 찍기
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
