package msa04;

import java.util.Scanner;

/*
 * �Է°� : 3
 * 
 * 1
 * 3 5
 * 7 9 11
 * 
 */
public class Hw2_doubleFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("input num:");
		int num = sc.nextInt();
		int a=1;
		
		//for��	1
		for(int i=1; i<=num; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(a +" ");
				a+=2;
			}
			System.out.println();
		}
		
	

		System.out.print("input num2:");
		int num2 = sc.nextInt();
		//while��
		int i=1,j,b=1;
		System.out.print(" ");
		while(i<=num2) {
			
			j=1;
			while(j<=i) {
				if(b%2==1) {
					System.out.print(b++);
					j++;
				}
				else {
					System.out.print(" ");
					b++;
				}
			}
			System.out.println();
			i++;
		}
		
		

	}

}
