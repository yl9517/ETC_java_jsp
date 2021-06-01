package msa02;

import java.util.Scanner;
/*
 * [문제2]
 * 받은 숫자의 분모만큼 더하기
 * 
 * 예시 ) 3
 * 과정 및 출력 ) 1 - 1/2 + 1/3 = ?
 * 
 * [문제3]
 * 덧셈 뺄셈 번갈아
 * 입력 예시 ) 4
 * 1-2+3-4 =?
 * 
 * [문제4]
 * 두수 su1,su2 입력받아 작은 수부터 큰 수까지 짝수값,총합 출력
 * 
 * 
 * 
 */
public class ForTest2_question {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====[문제2]=====");
		System.out.print("숫자를 입력하시오 : ");
		int num = sc.nextInt();
		
		float sum=0;
		
		for(int i=1; i<=num; i++) {
			
			float nextNum = (float)1/i;
			
			if(i%2==0) {
				sum-=nextNum; //이번에 들어온 짝수는 -해주기
				System.out.print(" - "+nextNum);
			}
			else {
				sum+=nextNum; //이번에 들어온 숫자는 + 해주기
				System.out.print(" + "+nextNum);
			}
		}
		System.out.printf(" = %.2f", sum);

		
		
		System.out.println("\n\n====[문제3]=====");
		System.out.println("숫자를 입력하시오 : ");
		int num2 = sc.nextInt();
		int sum2=0;
		
		for(int i=1; i<=num2; i++) {
			if(i%2==0) { //짝수면 -
				sum2-=i;
				System.out.print(" - "+i);
			}
			else {
				sum2+=i;
				System.out.print(" + "+i);
			}
		}
		System.out.println(" = "+sum2);
		
		
		

		System.out.println("\n\n====[문제4]=====");
		System.out.print("su1 : ");
		int max = sc.nextInt();
		System.out.print("su2 : ");
		int min = sc.nextInt();

		int temp;
		int sum3=0;
		
		if(min>max) { //큰수, 작은수 구분
			temp = min;
			min = max;
			max = temp;
		}
		
		for(int i=min; i<=max; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
				sum3+=i;
			}
		}
		System.out.println("총합 : "+sum3);
		
		
		
	}

}
