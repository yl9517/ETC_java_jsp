package msa04;

import java.util.Scanner;

/*

p135 ����7�� ����

 */
public class Hw8_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		while(true) {
			System.out.println("\n-----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------------");
			System.out.print(" ���� > ");
			int num=sc.nextInt();
			
			int account=0;
			if(num ==1) {
				System.out.print(" ���ݾ�> ");	
				account=sc.nextInt();
				money+=account;
			}
			else if(num==2) {
				System.out.print(" ��ݾ�> ");
				account=sc.nextInt();
				money-=account;
			}
			else if(num==3) {
				System.out.print(" �ܰ� > "+money);
			}
			else
				break;
		}
		System.out.println("\n���α׷� ����");
	}

}
