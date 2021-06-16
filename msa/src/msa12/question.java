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
class Info{
	private String name;
	private String jumin;
	
	public Info(String name,String jumin) {
		this.name = name;
		this.jumin = jumin;
	}
	
	
	public String getName() {
		return name;
	}

	public String getJumin() {
		return jumin;
	}



	//����
	public String gender(String firstNum) {
		String gender = "����"; //�⺻ ����
		if(firstNum.equals("2") || firstNum.equals("4"))
			gender = "����";
		return gender;
	}
	
	//��
	public String century(String jumin) {
		String firstNum = jumin.substring(7, 8);
		
		String year = "19".concat(jumin.substring(0, 2)); //�⺻ 20����
		
		if(firstNum.equals("3") || firstNum.equals("4")) //�ֹ� ���ڸ��� 3Ȥ�� 4�� 21����
			year = "20".concat(jumin.substring(0, 2));
		return year;
	}
	
	//����
	public String birth(String jumin) {
		String month = jumin.substring(2,4).concat("�� ");
		String day = jumin.substring(4,6).concat("��");
		
		return month+day;
	}
	
	//���� (Ķ���� Ŭ���� ����Ͽ�)
	public int age(String year) {
		return Calendar.getInstance().get(Calendar.YEAR)-Integer.parseInt(year);
		
	}
}
public class question {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� :");
		String name = sc.next();
		System.out.print("�ֹι�ȣ :");
		String jumin = sc.next();
		
		Info info = new Info(name, jumin); //��ü ����
			
		String gender = info.gender(jumin.substring(7, 8));		
		String year = info.century(jumin);
		String birth = info.birth(jumin);
		int age = info.age(year);
		
		System.out.println("�̸� : "+info.getName());
		System.out.println("������� : "+year.concat("�⵵ ").concat(birth));
		System.out.println("���� : "+gender);
		System.out.println("���� :"+age+"��");

	}

}
