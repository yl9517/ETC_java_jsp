package msa20;

public class p_ProductTh extends Thread{

	ProductConsume procon;
	public p_ProductTh(ProductConsume procon) {
		this.procon=procon;
	}
	
	public void run() {
		for(int i=1; i<100; i++) {
			procon.set(i);
			
			try {
				sleep(100);
			}catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
	
}
