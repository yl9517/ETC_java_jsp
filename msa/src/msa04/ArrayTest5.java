package msa04;
/*
 * ���ڿ� �迭
 * 
 * �迭ũ�� �Է¹޾� �ش� ũ�⸸ŭ �̸� �����
 * 
 */
import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�迭 ũ��: ");
		int num = sc.nextInt();
		String[] names = new String[num];
		
		for(int i=0; i<names.length; i++) {
			System.out.print("�̸��� �Է��ϼ��� :");
			names[i]=sc.next();
		}
		

		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
	}

}
