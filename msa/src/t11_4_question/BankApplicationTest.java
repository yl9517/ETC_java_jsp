package t11_4_question;

import java.util.Scanner;

public class BankApplicationTest {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run =true;
		
		while(run) {
			System.out.println();
			System.out.println("-------------------------------------------");
			System.out.println("1.���»��� | 2. ���¸�� | 3.���� | 4.��� | 5.���� ");
			System.out.println("-------------------------------------------");
			System.out.print("���� > ");
			
			int num = sc.nextInt();
			
			if(num ==1) 
				BankApplication.createAccount();
			else if(num ==2)
				BankApplication.accountList();
			else if(num ==3)
				BankApplication.deposit();
			else if(num ==4)
				BankApplication.withdraw();
			else if(num==5)
				run = false;
			
		}
		System.out.println("���α׷� ����");

	}
}