package msa03;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("===문제(for)==="); //입력값까지의 합
		
		System.out.print("input num : ");
		int su = sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=su; i++) {

			System.out.print(i +" ");
			sum+=i;
		}
		System.out.println("\n합계 : "+sum);
		
		

		System.out.println();
		System.out.println("===문제(while)==="); //입력값까지의 합
		
		System.out.print("input num : ");
		int num = sc.nextInt();
		
		int i=1;
		sum =0;
		while(i<=num) {
			
			System.out.print(i +" ");
			sum+=i;
			i++;
		}
		System.out.println("\nwhile합계 : "+sum);
		
		
		
		
		System.out.println();
		System.out.println("===문제2===");
		// 입력) 5
		// 출력) + - + - +
		
		
		System.out.print("숫자 입력 : ");
		int number = sc.nextInt();
		
		i = 1;
		String result = "";
		while(i<=number) {
			if(i%2==0) {
				result+=" - ";
			}
			else {
				result+=" + ";
			}
			i++;
		}
		System.out.println(result);
		
		
		
		System.out.println();
		System.out.println("===문제3 팩토리얼===");
		// 입력) 5
		// 출력) 5! = 5*4*3*2*1 = 120
		
		System.out.print("숫자 입력 : ");
		int fac = sc.nextInt();
		int result2 =1;
		
		System.out.print(fac+"! = ");
		
		while(fac>=1) {
			if(fac!=1) {
				System.out.print(fac+" * ");
			}
			else {
				System.out.print(fac);
			}
			result2*=fac;
			fac--;
		}
		
		System.out.println(" = "+result2);
		
		
	}

}
