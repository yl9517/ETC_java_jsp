package msa20;

//Thread Ŭ���� ��� or Runnable �������̽� ���
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
