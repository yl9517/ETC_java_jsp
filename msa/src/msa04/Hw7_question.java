package msa04;

import java.util.Scanner;

/*

p134 문제 5번 과제

중첩 for문 이용하여 4x+5y=60의 모든 해 구해서 (x,y)형태로 출력
조건 : x와 y는 10이하

 */
public class Hw7_question {

	public static void main(String[] args) {
		
		int sum = 60;
		
		for(int x=1; x<=10; x++) {
			
			for(int y=1; y<=10; y++) {
				if(sum == (4*x + 5*y)){
					System.out.printf("(%d, %d)\n",x,y);
				}
			}
		}
		
		
	}

}
