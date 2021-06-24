package msa19;

class Hey1 implements Runnable{
	private boolean flag;
	private String str;
	
	public Hey1(String str) {
		this.str=str;
	}
	
	public void setFlag(boolean flag) {
		this.flag=flag;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			
			try {
				Thread.sleep(400);
			}catch (Exception e) {
				System.out.println(e);
			}
			
			if(flag) 
				System.out.println(str+" working");
			else
				Thread.yield(); //양보
		}
		System.out.println(str+" 종료");
	}
}
public class YieldTest {

	public static void main(String[] args) {
		Hey1 ins = new Hey1("쓰레드1");
		Hey1 ins2 = new Hey1("쓰레드2");
		
		Thread th1 = new Thread(ins);
		Thread th2 = new Thread(ins2);
		
		th1.start();
		th2.start();
		

		try {
			Thread.sleep(400);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		ins.setFlag(true);
		ins2.setFlag(true);
		
		
	}

}
