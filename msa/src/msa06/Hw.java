package msa06;

import java.util.Scanner;

/*
 * su1,su2�Է¹޾� 
 * �޼��� add,sub,div,mul �޼��� �ۼ�
 * add => 2 + 3 = 5
 * div => 4/2 = 2 (����)
 * 		  2/3 = ��(�Ҽ���)
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
	
	String div(int su1,int su2) {
		
		if(su2==0)  //0�̸� ���� ���
			return "0���� ���� �� �����ϴ�.";
		else if(su1%su2==0) //�������� 0�̸� �� ������ ���̹Ƿ� ���� ����
			return su1/su2+"";
		else //�������� ������ �Ǽ��� ����
			return (float)su1/su2+"";
		
	}
	
}

public class Hw {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("input su1 : ");
		int su1 = sc.nextInt();
		System.out.print("input su2 : ");
		int su2 = sc.nextInt();

		Cal ins = new Cal();
		 
		//int add= ins.add(su1,su2);  //������ �޾Ƽ� �� ���� �����Ƿ� ���� ������ ����� ���� ��¿� �ٷ� ���ִ°� ����
		System.out.println(su1 +" + "+su2+" = "+ins.add(su1,su2));
		
		System.out.println(su1 +" - "+su2+" = "+ins.sub(su1,su2));
		
		System.out.println(su1 +" * "+su2+" = "+ins.mul(su1,su2));
		
		System.out.println(su1+ " / "+su2+" = "+ins.div(su1,su2));
		
	}

}
