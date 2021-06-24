package msa19;

class Job4 implements Runnable{
	private String str;
	public Job4(String str) {
		this.str=str;
	}
	
	@Override
	public void run() {
		System.out.println("쓰레드 생성 :"+str);
		
		
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
			}
			System.out.println(str+" 수행중..."+i);
		}
		
		System.out.println("쓰레드 종료:"+str);
	}
	
}

public class JoinTest {
	public static void main(String[] args) {
		
		Job4 ins = new Job4("job1");
		Thread th1 = new Thread(ins);
		th1.start();
		
		System.out.println("main 쓰레드 생성");
		
		try {
			th1.join(); //지정시간동안 쓰레디가 실행
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main thread : "+i);
		}
		
		System.out.println("main 쓰레드 종료");
		
	}
}
