package msa04;

import java.util.Scanner;

/*
 * [����1] �Ǻ���ġ ���� (���� ���ڿ� �ֱټ��� ����)
 * ��µǴ� ���� 20���ϸ� ���, �׷��� ������ �ߴ�
 * �Է�) 4
 * ���) 1 1 2 3
 * 
 * �Է�) 10
 * ���) 1 1 2 3 5 8 13
 * 
 */
public class Hw3_question {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("input num: ");
		int num = sc.nextInt();
		
		int fir = 1; //�ʱⰪ
		int sum = 0; //���� ��
		
		for(int i=1; i<=num; i++) {
			if(i%2==1) {
				System.out.print(fir + " ");
				sum+=fir;
			}
			else {
				System.out.print(sum + " ");
				fir+=sum;
				
			}
			
			if(sum >20 || fir>20) 
				break;			
		}

		

	}

}
