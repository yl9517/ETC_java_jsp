package t11_4_question;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	private static int index;
	//���»���
	public static void createAccount() {
		System.out.println("-------------");
		System.out.println("���»���");
		System.out.println("-------------");
		System.out.print("���¹�ȣ : ");
		String ano = sc.next();

		Account thisAccount = findAccount(ano); //���¹�ȣ ã��
		if(thisAccount==null) {
			System.out.print("������ : ");
			String owner = sc.next();
			System.out.print("�ʱ��Աݾ� : ");
			int balance = sc.nextInt();

			accountArray[index++] = new Account(ano, owner, balance);
			System.out.println("��� : ���°� �����Ǿ����ϴ�.");
		}
		else
			System.out.println("��� : ������ ���¹�ȣ�� �ֽ��ϴ�.");
	}
	
	//���¸��
	public static void accountList() {
		System.out.println("-------------");
		System.out.println("���¸��");
		System.out.println("-------------");
		for(int i=0; i<index; i++) {
			System.out.println(accountArray[i].getAno()+" \t"+accountArray[i].getOwner()+"\t"+accountArray[i].getBalance());
		}
	}
	
	//����
	public static void deposit() {
		System.out.println("-------------");
		System.out.println("����");
		System.out.println("-------------");
		System.out.print("���¹�ȣ : ");
		String ano = sc.next();
		
		Account thisAccount = findAccount(ano); //���¹�ȣ ã��
		
		if(thisAccount==null) 
			System.out.println("��� : ��ġ�ϴ� ���¹�ȣ�� �����ϴ�.");	
		else {
			System.out.print("�Աݾ� : ");
			thisAccount.setBalance(thisAccount.getBalance()+sc.nextInt());
	
			System.out.println("��� : ������ �����Ǿ����ϴ�.");	
		}
	}
	
	//���
	public static void withdraw() {
		System.out.println("-------------");
		System.out.println("���");
		System.out.println("-------------");
		System.out.print("���¹�ȣ : ");
		String ano = sc.next();
		
		Account thisAccount =  findAccount(ano); //���¹�ȣ ã��
		
		if(thisAccount==null) 
			System.out.println("��� : ��ġ�ϴ� ���¹�ȣ�� �����ϴ�.");
		else {
			System.out.print("��ݾ� : ");
			int money = sc.nextInt();
			
			if(thisAccount.getBalance()<money) 
				System.out.println("��� : �ܰ� �����մϴ�.");
			else {
				thisAccount.setBalance(thisAccount.getBalance()-money);
				System.out.println("��� : ����� �����Ǿ����ϴ�.");	
			}
		}
	}
	
	//Account �迭���� ano�� ������ Account ��ü ã��
	public static Account findAccount(String ano) {
		Account thisAccount = null;
		
		for(int i=0; i<index; i++) {
			if(accountArray[i].getAno().equals(ano))
				thisAccount = accountArray[i];
		}
		return thisAccount;
	}
	
	

}
