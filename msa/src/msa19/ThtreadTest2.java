package msa19;


class Job2 implements Runnable{

	private String str;
	
	public Job2(String str) {
		this.str = str;
	}
	
	@Override
	public void run() {
		System.out.println(str+" thread ������");
		
	}
	
	
}

public class ThtreadTest2 {

	public static void main(String[] args) {
		
		Job2 ins = new Job2("������1");
		Thread th1 = new Thread(ins);				
		th1.start();
	
	}

}
