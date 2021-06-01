package msa02;

import java.util.Scanner;

/*  switch문   
 * 	switch문의 경우에는 비교연산 등 사용X
 * 
 * */
public class SwtichTest3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수입력");
		
		int score = sc.nextInt();
		
		score/=10;
		
		switch(score) {
		
		case 10 :
		case 9 :
			System.out.print("수");
			break;
		case 8 :
			System.out.print("우");
			break;
		case 7 :
			System.out.print("미");
			break;
		case 6 :
			System.out.print("양");
			break;
		default :
			System.out.print("가");
		}
		

	}

}
