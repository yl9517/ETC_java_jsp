package msa04;

import java.util.Scanner;

/*
 * [문제1] 피보나치 수열 (이전 숫자와 최근숫자 더함)
 * 출력되는 값이 20이하면 출력, 그렇지 않으면 중단
 * 입력) 4
 * 출력) 1 1 2 3
 * 
 * 입력) 10
 * 출력) 1 1 2 3 5 8 13
 * 
 */
public class Hw3_question {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("input num: ");
		int num = sc.nextInt();
		
		int fir = 1; //초기값
		int sum = 0; //최종 합
		
		for(int i=1; i<=num; i++) {
			if(i%2==1) {
				System.out.print(fir + " ");
				sum+=fir;
			}
			else {
				System.out.print(sum + " ");
				fir+=sum;
				
			}
			
			if(sum >20 || fir>20) 
				break;			
		}

		

	}

}
