package msa19;


class Job3 implements Runnable{
	
	private String str;
	
	public Job3(String str) {
		this.str=str;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i
				++) {
			
			try {
				Thread.sleep(10);
			}catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(str+" : "+i);
		}
	}
	
}

public class SleepTest {

	public static void main(String[] args) {
		Job3 ins = new Job3("쓰레드1");
		Thread th1 = new Thread(ins);
		
		Job3 ins2 = new Job3("쓰레드2");
		Thread th2 = new Thread(ins2);
		
		th1.start();
		th2.start();
		
	}

}
