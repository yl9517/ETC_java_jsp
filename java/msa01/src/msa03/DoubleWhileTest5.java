package msa03;

import java.util.Scanner;

/*

�̸�,��,��,�� ���� �Է¹޾�
����, ���, ��ũ ���


 */
public class DoubleWhileTest5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		int tot=kor+eng+math;
		float avg=(float)tot/3;
		String rank="";
		
		if(avg>=90)
			rank="��";
		else if(avg>=80)
			rank="��";
		else if(avg>=70)
			rank="��";
		else if(avg>=60)
			rank="��";
		else
			rank="��";
			
		System.out.println("===���===");
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+tot);
		System.out.printf("��� : %.1f\n",avg);
		System.out.println("���뵵 : "+rank);

	}

}
