package msa01;

import java.util.Scanner;

//����
/* ���� 3���� �Է¹޾� �ּҰ�,�ִ밪 ���ϱ� */

public class homework1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println
		("���� 3���� �Է��Ͻÿ� : ");
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
	
		int max=one;
		int min=one;
		
		
		//��� 1 : �������Ǹ� �̿�
		max = (max>two)? max:two;
		max = (max>three)? max:three;
		
		min = (min<two)? min:two;
		min = (min<three)? min:three;

		System.out.println("[���1] �ִ밪 : "+max+" | �ּҰ� : "+min);
		
	
		
		
		//���2 : if ���ǹ� ����
		if(one>two) {
			max = (one>three)? one:three;
			min = (two<three)? two:three;
		}
		else {
			max = (two>three)? two:three;
			min = (one<three)? one:three;
		}
		

		System.out.println("[���2] �ִ밪 : "+max+" | �ּҰ� : "+min);
		
		
		
	}

}
