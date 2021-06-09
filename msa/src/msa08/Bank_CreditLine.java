package msa08;

public class Bank_CreditLine extends Bank {

	public Bank_CreditLine(String bankNo, String name, int balance,int limit) {
		super(bankNo, name, balance,limit);
	}
	
	@Override
	public void withdraw(int money) { //출금
		if(getBalance()+getLimit()<money)
			System.out.println("출금 불가");
		else
			setBalance(getBalance()-money);
	}

	
}
