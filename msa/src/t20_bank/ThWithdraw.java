package t20_bank;

class ThWithdraw implements Runnable {
	private Bank bank;
	
	public ThWithdraw(Bank bank) {
		this.bank = bank;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
	
			try {
				Thread.sleep(400);
				
				synchronized (bank) {
					bank.widthDraw(10);
				}
			} catch (Exception e) { //잔고 부족시 예외처리
				System.out.println(e);
			}
		}
	}
	
}
