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
			for(int j=num; j>=1; j--) { //������ 5�� ���ƾ���
				if(j<=i) { // j�� i���� ���ų� �۴ٸ� 2�� �����ϴ� ���� ���
					System.out.print(a+"\t");
					a+=2;
				}
				else  //j�� i���� ũ�ٸ� ���� ���
					System.out.print(" \t");
			}
			System.out.println();
			
		}
		
		
	}

}
