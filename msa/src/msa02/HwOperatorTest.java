package msa02;

import java.util.Scanner;

public class HwOperatorTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input su1");
		int su1 = sc.nextInt();
		System.out.println("input su2");
		int su2 = sc.nextInt();
		System.out.println("input su3");
		int su3 = sc.nextInt();
		
		// Ÿ�� ���� = (����)? ��:����;
		
		int max = (su1>su2)? su1:su2;
		max = (max>su3)? max:su3;
		
		int min = (su1<su2)? su1:su2;
		min = (min<su3)? min:su3;
		
		System.out.println("�ִ밪 : "+max+" | �ּҰ� : "+min);
	}

}
