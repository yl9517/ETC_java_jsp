package msa19;

class Job extends Thread{
	public Job(String str) {
		super(str);
	}

	@Override
	public void run() {
		
		for(int i =0; i<10; i++) {
			try {
				Thread.sleep(400);   // sleep : �Ͻ�����
			}catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(getName()+ " Thread ������..."+i);
		}
		
	}
	
	
	
	
}

public class ThtreadTest {

	public static void main(String[] args) {
		
		Job ins = new Job("������1");
		Job ins2 = new Job("������2");

		ins.start(); //run �ڵ�ȣ��
		ins2.start();
		
		
		for(int i=0; i<10; i++) {  
			try {
				Thread.sleep(500);	//Main�� Thread�̴�.
			}catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("main");
		}
		
	
				
	}

}
