package msa01;

import java.util.Scanner;

/*
 * 		byte short int long float bouble
 * 			 char
 * 
 */
public class InputTest {

	public static void main(String[] args) {
		
		char a = 'a';
		System.out.println(a);
		
		int ch = a; 	//a��� ������ �ڵ尪 ���
		System.out.println(ch);
		
		String b ="abc";
		
		//---------------------�Է¹ޱ�------------------
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");	
		String name = sc.nextLine();
		
		System.out.print("���� ������ �Է��ϼ��� : ");	
		int korean = Integer.parseInt(sc.nextLine());
		
		System.out.print("���� ������ �Է��ϼ��� : ");	
		int engilsh = sc.nextInt();

		System.out.print("���� ������ �Է��ϼ��� : ");	
		int math = sc.nextInt();
		
		int total = korean+engilsh+math;
		float avg = (float)total/3;  //Ȥ��    total/3.0f;
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+korean);
		System.out.println("���� : "+engilsh);
		System.out.println("���� : "+math);
		System.out.println("���� : "+total);
		System.out.printf("��� : %.1f\n ", avg);
		
		System.out.println("------�հ� ����------");
		//��������� 60�� �̻��̸� �հ� �ƴϸ� ���հ��� ����Ͻÿ�.
		if(avg>=60)
			System.out.println("�հ�");
		else
			System.out.println("���հ�");
		
		

	}

}
