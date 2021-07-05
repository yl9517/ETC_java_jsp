package msa20;

public class ProductConsume {
	
	private boolean flag = false;
	private int goods = 0;
	
	//���� ���� �������� �𸣳�, ������ ������ ������ get�� �����Ѵ� �ص�
	//get�� blocked ��Ű�鼭 set�� ���۵�. 
	//set������ blocked �ƿ�鼭 get����
	
	public int get() {	//�Һ�
		while(flag == false) {
			try {
				wait();  //false�� ���߱�(blocked����), �� set����
			}catch (InterruptedException e) {
				
			}
		} //while
		notifyAll();
		flag = false;
		return goods;
		
	} //get�޼ҵ�
	
	 public synchronized void set(int goods) { //����
		while(flag==true) {
			try {
				wait(); // blocked����
			}catch (Exception e) {
				// TODO: handle exception
			}
		} //while
		
		this.goods=goods;
		System.out.println(this.goods+"��° �ڿ��� �����߽��ϴ�.");
		
		notifyAll(); //wait�� ���� Ǯ���! 
		flag= true;	
				//���� ���� ���۵����� �𸣳� set�� ���͵� true������ wait�� / �ᱹ get���۵�
		
	} //set�޼ҵ�

}
