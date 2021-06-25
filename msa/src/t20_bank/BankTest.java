package t20_bank;

class BankTest {
	

	public static void main(String[] args) {
		Bank bank = new Bank("hong",100); //공유자원 - critical section : 임계영역
		
		ThDeposit j1 = new ThDeposit(bank);
		ThWithdraw j2 = new ThWithdraw(bank);
		
		Thread th1 = new Thread(j1);
		Thread th2 = new Thread(j2);
		
		th1.start();
		th2.start();
		
	}
}
