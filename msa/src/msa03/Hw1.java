package msa03;

import java.util.Scanner;

/* [day2 3번문제] -, + 번갈아 계산,값 출력 (for문 이용)
 * 
 * 입력) 4
 * 출력) 1-2+3-4 =?
 * 
 * 
 * [3번문제 while문 이용]
 * 
 * */

public class Hw1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("input su : ");
		int su = sc.nextInt();
		
		String process = "1";
		int result = 1;
		
		for(int i=2; i<=su; i++) {
			if(i%2==0) { //짝수
				process+= " - "+i;
				result-=i;
			}
			else {
				process+= " + "+i;
				result+=i;
			}
		}
		System.out.println(process+" = "+result);
		
		
		
		System.out.println();
		System.out.println("====while문 이용====");
		
		System.out.print("input su2 : ");
		int su2 = sc.nextInt();
		
		int i=1;
		int result2 =1;
		String process2 = "1";
		
		while(i<su2) {
			i++;
			
			if(i%2==0) {//짝수 -출력
				process2+=" - "+i;
				result2-=i;
			}
			else { //홀수 +출력
				process2+=" + "+i;
				result2+=i;
			}
			
		}
		System.out.println(process2 + " = "+result2);
		

	}

}
