package msa04;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 1. int ������ �迭 ũ�� 3���� ���� Scanner�� �̿��Ͽ� �� �Է�
		// 2. ���

		int[] arr = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		//�Է�
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+"��°�� �� ���� �Է����ּ���: ");
			arr[i] = sc.nextInt();
		}
		
		//���
		for(int i=0; i<arr.length; i++) 
			System.out.print(arr[i]);
		
		
		
	}

}
