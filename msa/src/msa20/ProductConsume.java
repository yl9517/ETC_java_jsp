package msa20;

public class ProductConsume {
	
	private boolean flag = false;
	private int goods = 0;
	
	//뭐가 먼저 동작할지 모르나, 생산한 물건이 없을때 get이 동작한다 해도
	//get은 blocked 시키면서 set이 동작됨. 
	//set동작후 blocked 꺠우면서 get동작
	
	public int get() {	//소비
		while(flag == false) {
			try {
				wait();  //false면 멈추기(blocked상태), → set동작
			}catch (InterruptedException e) {
				
			}
		} //while
		notifyAll();
		flag = false;
		return goods;
		
	} //get메소드
	
	 public synchronized void set(int goods) { //생산
		while(flag==true) {
			try {
				wait(); // blocked상태
			}catch (Exception e) {
				// TODO: handle exception
			}
		} //while
		
		this.goods=goods;
		System.out.println(this.goods+"번째 자원을 생산했습니다.");
		
		notifyAll(); //wait된 것을 풀어라! 
		flag= true;	
				//이후 뭐가 동작될지는 모르나 set이 들어와도 true때문에 wait됨 / 결국 get동작됨
		
	} //set메소드

}
