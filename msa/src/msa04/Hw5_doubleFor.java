package msa04;

import java.util.Scanner;

/*

[1번]
* * * *
* * *
* *
* 

[2번]
* * * *
  * * *
    * *
      *


 */
public class Hw5_doubleFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input num: ");
		int num = sc.nextInt();
		
		for(int i=num; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		//2번
	
		for(int i=4; i>=1; i--) {
			for(int j=4; j>=1; j--) { //무조건 4번 돌아야함
				if(j<=i) {  //i번째와 같거나 작아야 출력
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
	}

}
