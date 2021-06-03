package msa03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


/*
 * 모든 홀수값들을 출력하되 총합이 입력값보다 작거나 같을때까지 출력
 * 
 * 입력) 10
 * 출력) 1+3+5  (+7+9 까지는 총합이 10이 넘으므로 생략)
 * 
 * 
 * 
 */
public class WhileTest3 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===문제(for)==="); //입력값까지의 합
		
		System.out.print("input num : ");
		int su = sc.nextInt();
		int sum=0;
		
		for(int i=1; ; i++) {
			if(i%2==1) {
				sum+=i;
				if(sum>su)  //총합이 입력값보다 커지면 스톱
					break;
				
				System.out.print(i+" ");
			}
			
		}
		
		
		//------------------------------------
		System.out.println();
		System.out.println();
		System.out.println("===문제(while)==="); //입력값까지의 합
		
		
		System.out.print("input num : ");
		int num = sc.nextInt();
		int sum2 = 0;
		int i=0;
		while(true) {
			i++;
			if(i%2==1) {
				sum2+=i;
				
				if(sum2>num) 
					break;
				
				System.out.print(i+" ");
			}	
		}

	
		
	}

}
