package msa20;

//Thread 클래스 상속 or Runnable 인터페이스 상속
public class B_ThDeposit implements Runnable {
	private Bank bank;
	
	public B_ThDeposit(Bank bank) {
		this.bank = bank;
	}
	
	@Override
	public void run() {

		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			bank.deposit(10);
		}
		
	}
	
}
