package msa04;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1¹ø¹®Á¦
		// 1 - 1/2 + 1/3 ...
		System.out.print("input su : ");
		int su = sc.nextInt();
		
		String process = "1";
		float sum=1;
		
		for(int i=2; i<=su; i++) {
			
			if(i%2==0) {//Â¦¼ö
				process+= " - 1/"+i;
				sum-=(float)1/i;
			}
			else {
				process+=" + 1/"+i;
				sum+=(float)1/i;
			}
		}
		System.out.println(process+" = "+sum);
		
		
	}

}
