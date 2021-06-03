package msa04;

import java.util.Scanner;

/*

1  3  5  7  9
  11 13 15 17
     19 21 23
        25 27
           31


 */
public class Hw6_doubleFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("input num : ");
		int num = sc.nextInt();
		
		int a=1;
		for(int i=num; i>=1; i--) {
			for(int j=num; j>=1; j--) { //무조건 5번 돌아야함
				if(j<=i) { // j가 i보다 같거나 작다면 2씩 증가하는 숫자 출력
					System.out.print(a+"\t");
					a+=2;
				}
				else  //j가 i보다 크다면 공백 출력
					System.out.print(" \t");
			}
			System.out.println();
			
		}
		
		
	}

}
