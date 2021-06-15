package t11_4_question;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	private static int index;
	//계좌생성
	public static void createAccount() {
		System.out.println("-------------");
		System.out.println("계좌생성");
		System.out.println("-------------");
		System.out.print("계좌번호 : ");
		String ano = sc.next();

		Account thisAccount = findAccount(ano); //계좌번호 찾기
		if(thisAccount==null) {
			System.out.print("계좌주 : ");
			String owner = sc.next();
			System.out.print("초기입금액 : ");
			int balance = sc.nextInt();

			accountArray[index++] = new Account(ano, owner, balance);
			System.out.println("결과 : 계좌가 생성되었습니다.");
		}
		else
			System.out.println("결과 : 동일한 계좌번호가 있습니다.");
	}
	
	//계좌목록
	public static void accountList() {
		System.out.println("-------------");
		System.out.println("계좌목록");
		System.out.println("-------------");
		for(int i=0; i<index; i++) {
			System.out.println(accountArray[i].getAno()+" \t"+accountArray[i].getOwner()+"\t"+accountArray[i].getBalance());
		}
	}
	
	//예금
	public static void deposit() {
		System.out.println("-------------");
		System.out.println("예금");
		System.out.println("-------------");
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		
		Account thisAccount = findAccount(ano); //계좌번호 찾기
		
		if(thisAccount==null) 
			System.out.println("결과 : 일치하는 계좌번호가 없습니다.");	
		else {
			System.out.print("입금액 : ");
			thisAccount.setBalance(thisAccount.getBalance()+sc.nextInt());
	
			System.out.println("결과 : 예금이 성공되었습니다.");	
		}
	}
	
	//출금
	public static void withdraw() {
		System.out.println("-------------");
		System.out.println("출금");
		System.out.println("-------------");
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		
		Account thisAccount =  findAccount(ano); //계좌번호 찾기
		
		if(thisAccount==null) 
			System.out.println("결과 : 일치하는 계좌번호가 없습니다.");
		else {
			System.out.print("출금액 : ");
			int money = sc.nextInt();
			
			if(thisAccount.getBalance()<money) 
				System.out.println("결과 : 잔고가 부족합니다.");
			else {
				thisAccount.setBalance(thisAccount.getBalance()-money);
				System.out.println("결과 : 출금이 성공되었습니다.");	
			}
		}
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	public static Account findAccount(String ano) {
		Account thisAccount = null;
		
		for(int i=0; i<index; i++) {
			if(accountArray[i].getAno().equals(ano))
				thisAccount = accountArray[i];
		}
		return thisAccount;
	}
	
	

}
