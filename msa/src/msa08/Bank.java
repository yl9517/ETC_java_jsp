package msa08;


public class Bank{
	private String bankNo; //���¹�ȣ
	private String name; //������̸�
	private int balance; //�ܰ�
	private int limit; //�ܰ�
	//������
	public Bank(String bankNo,String name,int balance,int limit) {
			this.bankNo=bankNo;
			this.name=name;
			this.balance=balance;
			this.limit=limit;  //���� �� �ִ� �� �ѵ�
	}
		
			
	//�޼ҵ�
	public void print() { 	//���
		System.out.println("���¹�ȣ : "+bankNo);
		System.out.println("������̸�: "+name);
		System.out.println("�ܰ� : "+balance);
	}
	
	public void deposit(int money) { //�Ա�
		if(money<0)
			System.out.println("�Է¿���.");
		else
			balance+=money;
	}
	public void withdraw(int money) { //���
		if(balance<money)
			System.out.println("�Է¿���.");
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
