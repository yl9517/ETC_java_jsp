package msa11;

public class Account {
	private int balance=0;
	private final int min_balance=0;
	private final int max_balance=1000000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance>=min_balance && balance<=max_balance)
			this.balance=balance;
	}
	
}
