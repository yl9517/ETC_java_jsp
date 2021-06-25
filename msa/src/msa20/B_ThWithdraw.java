package msa20;

public class B_ThWithdraw implements Runnable {
	private Bank bank;
	
	public B_ThWithdraw(Bank bank) {
		this.bank = bank;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
	
			try {
				Thread.sleep(400);
				bank.widthDraw(10);
			} catch (Exception e) { //잔고 부족시 예외처리
				System.out.println(e);
			}
		}
	}
	
}
