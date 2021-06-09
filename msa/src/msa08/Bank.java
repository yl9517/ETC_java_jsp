package msa08;


public class Bank{
	private String bankNo; //계좌번호
	private String name; //사용자이름
	private int balance; //잔고
	private int limit; //잔고
	//생성자
	public Bank(String bankNo,String name,int balance,int limit) {
			this.bankNo=bankNo;
			this.name=name;
			this.balance=balance;
			this.limit=limit;  //빌릴 수 있는 돈 한도
	}
		
			
	//메소드
	public void print() { 	//출력
		System.out.println("계좌번호 : "+bankNo);
		System.out.println("사용자이름: "+name);
		System.out.println("잔고 : "+balance);
	}
	
	public void deposit(int money) { //입급
		if(money<0)
			System.out.println("입력오류.");
		else
			balance+=money;
	}
	public void withdraw(int money) { //출력
		if(balance<money)
			System.out.println("입력오류.");
		else
			balance-=money;
	}


	public String getBankNo() {
		return bankNo;
	}


	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public int getLimit() {
		return limit;
	}


	public void setLimit(int limit) {
		this.limit = limit;
	}
	

	//get,set
	
	
}
