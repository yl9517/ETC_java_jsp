package msa20;

//bank = 공유자원
public class Bank {
	private String name;
	private int balance;
	
	public Bank(String name, int balance) {
		this.name=name;
		this.balance=balance;
	}
	
	//출금
	public synchronized void widthDraw(int money) throws Exception{ //synchronized = 동기화
		if(balance<money)
			throw new Exception("잔고 부족"); //예외처리
		
		balance-=money;
		System.out.println("출금 | 잔액 : "+balance);
	}
	
	//입금
	public synchronized void deposit(int money) {
		balance+=money;
		System.out.println("입금 | 잔액 : "+balance);
	}
	
}
