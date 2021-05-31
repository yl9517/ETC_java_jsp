package msa01;

import java.util.Scanner;

/*
 * 조건 연산
 */
public class OpTest9 {

	public static void main(String[] args) {
		
		//(조건)? 참 : 거짓;   =>   3항연산
		
		int su=10;
		int result;
		result = (su>10)? su*2 : su*4;  //su가 10보다 큰가? 참이면 su*2 | 거짓이면 su*4
		System.out.println(result);
		
		
		int score = 80;
		String result2 = (score>=60)? "합격":"불합격";
		System.out.println(result2);
		
	
		
	}
}
