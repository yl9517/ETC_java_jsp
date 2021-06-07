package msa05;
//피보나치 수열

import java.util.Scanner;

public class Hw {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("input num:");
		int num=sc.nextInt();
		
		int a=1,b=1;
		int c;
		
		System.out.print(a+" "+b+" ");
		
		for(int i=1; i<=num-2; i++) {
			c= a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
			if( a>20 || b>20)
				break;
		}
		
	}

}
