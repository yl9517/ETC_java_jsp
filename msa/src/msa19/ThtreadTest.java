package msa19;

class Job extends Thread{
	public Job(String str) {
		super(str);
	}

	@Override
	public void run() {
		
		for(int i =0; i<10; i++) {
			try {
				Thread.sleep(400);   // sleep : 일시정지
			}catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(getName()+ " Thread 동작중..."+i);
		}
		
	}
	
	
	
	
}

public class ThtreadTest {

	public static void main(String[] args) {
		
		Job ins = new Job("쓰레드1");
		Job ins2 = new Job("쓰레드2");

		ins.start(); //run 자동호출
		ins2.start();
		
		
		for(int i=0; i<10; i++) {  
			try {
				Thread.sleep(500);	//Main도 Thread이다.
			}catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("main");
		}
		
	
				
	}

}
