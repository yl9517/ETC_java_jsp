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
			} catch (Exception e) { //�ܰ� ������ ����ó��
				System.out.println(e);
			}
		}
	}
	
}
