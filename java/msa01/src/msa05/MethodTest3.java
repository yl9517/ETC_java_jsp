package msa05;
/*
 * 1. ���ο��� �Է¹޾� B class�� prt �޼��忡�� ���
 * 2. ���ο��� ���� �Է¹޾� calAge()�� ����� 10~60�븦 ���ο��� ���
 * 
 */
import java.util.Scanner;

class Man{
	
	int age=10;
	
}


public class MethodTest3 {

	public static void main(String[] args) {

		Man ins1 = new Man();
		Man ins2 = new Man();
		
		System.out.println(ins1 ==ins2);
		System.out.println(ins1.age==ins2.age);
		
		Man ins3 =ins1;
		System.out.println(ins3==ins1);
		
	}

}
