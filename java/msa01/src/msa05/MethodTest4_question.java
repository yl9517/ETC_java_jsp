package msa05;

import java.util.Scanner;

/*
 * su1,su2�Է¹޾� 
 * �޼��� add,sub,div,mul �޼��� �ۼ�
 * add => 2 + 3 = 5
 * div => 2/3 = ��(�Ҽ���)
 *        2/0 = 0���� ������ ����
 * 
 * 
 */

class Cal{
	
	int add(int su1,int su2) {
		return (su1+su2);
	}
	int sub(int su1,int su2) {
		return (su1-su2);
	}

	int mul(int su1,int su2) {
		return (su1*su2);
	}
	float div(int su1,int su2) {
		float su3 = -1.0f;
		
		if(su2!=0) //���°��� 0�� �ƴ϶�� ���
			su3 =(float)su1/su2;
		
		return su3;
	}
	
}

public class MethodTest4_question {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("input su1 : ");
		int su1 = sc.nextInt();
		System.out.print("input su2 : ");
		int su2 = sc.nextInt();

		Cal ins = new Cal();
		
		int add= ins.add(su1,su2);
		System.out.println(su1 +" + "+su2+" = "+add);
		
		int sub= ins.sub(su1,su2);
		System.out.println(su1 +" - "+su2+" = "+sub);
		
		int mul= ins.mul(su1,su2);
		System.out.println(su1 +" * "+su2+" = "+mul);
		
		
		float div= ins.div(su1,su2);
		System.out.print(su1+ " / "+su2+" = ");
		
		if(div == -1.0f) { //���� ���� -1.0f���
			String msg ="0���� ���� �� �����ϴ�.";
			System.out.printf(msg);
		}
		else 
			System.out.printf("%.2f",div);
		
	}

}
