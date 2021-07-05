package msa20;

public class BankTest {

	public static void main(String[] args) {
		Bank bank = new Bank("hong",100); //공유자원 - critical section : 임계영역
		
		B_ThDeposit j1 = new B_ThDeposit(bank);
		B_ThWithdraw j2 = new B_ThWithdraw(bank);
		
		Thread th1 = new Thread(j1);
		Thread th2 = new Thread(j2);
//		Thread th3 = new Thread(new B_ThDeposit(bank));
		
		th1.start();
		th2.start();
		
	}
}
