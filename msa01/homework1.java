package msa01;

import java.util.Scanner;

//과제
/* 숫자 3개를 입력받아 최소값,최대값 구하기 */

public class homework1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println
		("숫자 3개를 입력하시오 : ");
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
	
		int max=one;
		int min=one;
		
		
		//방법 1 : 삼항조건만 이용
		max = (max>two)? max:two;
		max = (max>three)? max:three;
		
		min = (min<two)? min:two;
		min = (min<three)? min:three;

		System.out.println("[방법1] 최대값 : "+max+" | 최소값 : "+min);
		
	
		
		
		//방법2 : if 조건문 포함
		if(one>two) {
			max = (one>three)? one:three;
			min = (two<three)? two:three;
		}
		else {
			max = (two>three)? two:three;
			min = (one<three)? one:three;
		}
		

		System.out.println("[방법2] 최대값 : "+max+" | 최소값 : "+min);
		
		
		
	}

}
