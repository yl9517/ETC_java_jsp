package msa02;

import java.util.Scanner;
/*
 * [����2]
 * ���� ������ �и�ŭ ���ϱ�
 * 
 * ���� ) 3
 * ���� �� ��� ) 1 - 1/2 + 1/3 = ?
 * 
 * [����3]
 * ���� ���� ������
 * �Է� ���� ) 4
 * 1-2+3-4 =?
 * 
 * [����4]
 * �μ� su1,su2 �Է¹޾� ���� ������ ū ������ ¦����,���� ���
 * 
 * 
 * 
 */
public class ForTest2_question {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====[����2]=====");
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		
		float sum=0;
		
		for(int i=1; i<=num; i++) {
			
			float nextNum = (float)1/i;
			
			if(i%2==0) {
				sum-=nextNum; //�̹��� ���� ¦���� -���ֱ�
				System.out.print(" - "+nextNum);
			}
			else {
				sum+=nextNum; //�̹��� ���� ���ڴ� + ���ֱ�
				System.out.print(" + "+nextNum);
			}
		}
		System.out.printf(" = %.2f", sum);

		
		
		System.out.println("\n\n====[����3]=====");
		System.out.println("���ڸ� �Է��Ͻÿ� : ");
		int num2 = sc.nextInt();
		int sum2=0;
		
		for(int i=1; i<=num2; i++) {
			if(i%2==0) { //¦���� -
				sum2-=i;
				System.out.print(" - "+i);
			}
			else {
				sum2+=i;
				System.out.print(" + "+i);
			}
		}
		System.out.println(" = "+sum2);
		
		
		

		System.out.println("\n\n====[����4]=====");
		System.out.print("su1 : ");
		int max = sc.nextInt();
		System.out.print("su2 : ");
		int min = sc.nextInt();

		int temp;
		int sum3=0;
		
		if(min>max) { //ū��, ������ ����
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
		System.out.println("���� : "+sum3);
		
		
		
	}

}
