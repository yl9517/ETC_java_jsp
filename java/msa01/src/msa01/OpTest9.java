package msa01;

import java.util.Scanner;

/*
 * ���� ����
 */
public class OpTest9 {

	public static void main(String[] args) {
		
		//(����)? �� : ����;   =>   3�׿���
		
		int su=10;
		int result;
		result = (su>10)? su*2 : su*4;  //su�� 10���� ū��? ���̸� su*2 | �����̸� su*4
		System.out.println(result);
		
		
		int score = 80;
		String result2 = (score>=60)? "�հ�":"���հ�";
		System.out.println(result2);
		
	
		
	}
}
