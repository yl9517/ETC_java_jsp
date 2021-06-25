package t20_bank;

//Thread Ŭ���� ��� or Runnable �������̽� ���
class ThDeposit implements Runnable {
	private Bank bank;
	
	public ThDeposit(Bank bank) {
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
			
			synchronized (bank) {
				bank.deposit(10);				
			}
		}
		
	}
	
}
