package msa05;
/*
 * 1. ���ο��� �Է¹޾� B class�� prt �޼��忡�� ���
 * 2. ���ο��� ���� �Է¹޾� calAge()�� ����� 10~60�븦 ���ο��� ���
 * 
 */
import java.util.Scanner;

class B{
	
	void prt(String irum) {
		System.out.println("�̸��� "+irum);
	}
	
	String calAge(int age) {
		String thisAge="";
		
		if(age>=60)
			thisAge = "60�� �̻�";
		else if(age>=50)
			thisAge = "50��";
		else if(age>=40)
			thisAge = "40��";
		else if(age>=30)
			thisAge = "30��";
		else if(age>=20)
			thisAge = "20��";
		else if(age>=10)
			thisAge = "10��";
		else
			thisAge = "10�� ����";
			
		return thisAge;
	}
	
}


public class MethodTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		B ins = new B();
		//ins �� �ν��Ͻ�(��ü�� ��üȭ)  //new B();�� ��ü
		
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.next();
		ins.prt(name);
		
		
		// 2. ���ο��� ���� �Է¹޾� calAge()�� ����� 10~60�븦 ���ο��� ���
		System.out.print("���� �Է� : ");
		int agee = sc.nextInt();
		
		String firAge = ins.calAge(agee);
		System.out.println("����� "+firAge+" �Դϴ�");
		
	
	}

}
