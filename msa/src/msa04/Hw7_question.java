package msa04;

import java.util.Scanner;

/*

p134 ���� 5�� ����

��ø for�� �̿��Ͽ� 4x+5y=60�� ��� �� ���ؼ� (x,y)���·� ���
���� : x�� y�� 10����

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
