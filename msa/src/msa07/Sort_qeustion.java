package msa07;
//�ִ� 10������ �̸�,����,���� �Է¹޾� ����,���,���뵵 ���
//���� ������ ������ ����, �迭�� �Է�
/*
 *�Է¿��� ) �Է��� �ο����� ? [2]  //11�̻� �Է½� -> �ο��� �߸� �Է��Ͽ����ϴ�.
 *        �̸� : [�̸�]
 *        ���� : [����]
 *        ���� : [����]
 *        ...
 *
 * ��¿���) �̸�   ����   ����   ����    ���   ���뵵
 *        ȫ�浿  80  70  150  75   C
 *        ȫ���  60  40  100  50   F
 * 
 */

import java.util.Scanner;

class Sort{
	//�ʵ�
	String name;
	int kor;
	int eng;
	//������
	
	
	//�޼ҵ�
	
}
public class Sort_qeustion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("�Է��� �ο����� ? : ");
		int num = sc.nextInt();
		
		//1���� �迭
		String[] name = new String[num];
		int[] kor = new int[num];
		int[] eng = new int[num];		
		int[] tot = new int[num];
		float[] avg = new float[num];
		char[] rank = new char[num];

		String[][] Student = new String[num][5];
		
		if(num > 10)
			System.out.println("�ο��� �߸� �Է��Ͽ����ϴ�.");
		
		//�ο�����ŭ �̸�,����,���� �Է�
		for(int i=0; i<num; i++) {
			System.out.print("�̸� : ");
			name[i] = sc.next();
			System.out.println("���� : ");
			kor[i] = sc.nextInt();
			System.out.println("���� : ");
			eng[i] = sc.nextInt();
			
			tot[i] = kor[i]+eng[i];
			avg[i] = (kor[i]+eng[i])/2;
			
			if(avg[i]>=90)
				rank[i] = 'A';
			else if(avg[i]>=80)
				rank[i] = 'B';
			else if(avg[i]>=70)
				rank[i] = 'C';
			else if(avg[i]>=60)
				rank[i] = 'D';
			else
				rank[i] = 'F';
		}
		
		
		int temp;
		
		//���� �������� ��������
		for(int i=0; i<tot.length-1; i++) {
			for(int j=i+1; j<tot.length; j++) {
				
				if(tot[i]<tot[j]) { //���� ������ �ٲ�
					temp = tot[i];
					tot[i] = tot[j];
					tot[j] = temp;
				}
				
			}
		}
		
		
	

	}

}