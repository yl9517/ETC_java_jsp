package msa04;

import java.util.Scanner;

/*
��,��,�� �Է¹ޱ�

��� 90�̸� excellent
�Ѱ����̶� 90�̻��̸� good
��� 90�̸��̸� bad


 */
public class Hw4_if {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input name: ");
		String name = sc.next();
		System.out.print("input kor: ");
		int kor = sc.nextInt();
		System.out.print("input eng: ");
		int eng = sc.nextInt();
		System.out.print("input math: ");
		int math = sc.nextInt();
		
		String rank = "";
		
		if(kor>=90 && eng>=90 && math>=90) {
			rank="excellent";
		}
		else if(kor>=90 || eng>=90 || math>=90) {
			rank="good";
		}
		else {
			rank="bad";
		}

		System.out.println("�̸� : "+name);
		System.out.printf("���� : %d, ����: %d, ����: %d\n", kor,eng,math);
		System.out.println("���뵵 :"+rank);
		

	}

}
