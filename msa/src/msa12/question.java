package msa12;

import java.util.Calendar;
import java.util.Scanner;

/*
 * �̸�:
 * �ֹι�ȣ : 900101-1010111
 * 			010101-4010111
 * 
 * =>�̸� : ȫ�浿 
 * 	 ������� : 1990�⵵ 01�� 01��
 * 	 ���� : ��
 *   ���� : 31�� (2021-1990)
 *   
 * => �̸� : ȫ���
 *    ������� : 2001�⵵ 01�� 01��
 *    ���� : ��
 *    ���� : 20��
 * 
 */
//�ֹι�ȣ �ް� String �޼ҵ� ã�Ƽ� ������Ϸ� ����
//Ķ���� Ŭ������ ���� �⵵ ã�Ƽ� ���� ���ϱ� 

public class question {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸� :");
		String name = sc.next();
		System.out.print("�ֹι�ȣ :");
		String num = sc.next();
		
		String genderNum = num.substring(7, 8);
		
		String year = "19".concat(num.substring(0, 2)); //�⺻ 20����
		String month = num.substring(2,4);
		String day = num.substring(4,6);
		
		String gender = "��"; //�⺻ ��
		
		
		//20���� ����
		if(genderNum.equals("2"))  //����
				gender ="��";		
		//21���� + ��,�� ����
		else if(genderNum.equals("3")) { //21���� ����,����
			year = "20".concat(num.substring(0, 2));
			
			if(genderNum.equals("4")) 
				gender ="��";			
		}
	
		
	}

}
