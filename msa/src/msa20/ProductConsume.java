package msa20;

public class ProductConsume {
	
	private boolean flag = false;
	private int goods = 0;
	
	public int get() {
		while(flag == false) {
			try {
				wait();
			}catch (InterruptedException e) {
				
			}
		} //while
		
		notifyAll();
		flag = false;
		return goods;
		
	} //get�޼ҵ�
	
	synchronized public void set(int goods) {
		while(flag==true) {
			try {
				wait();
			}catch (Exception e) {
				// TODO: handle exception
			}
		} //while
		
		this.goods=goods;
		System.out.println(this.goods+"��° �ڿ��� �����߽��ϴ�.");
		notifyAll();
		flag= true;
		
		
	} //set�޼ҵ�

}
