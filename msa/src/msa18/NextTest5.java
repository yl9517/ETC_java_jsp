package msa18;

interface Runnable{
	
	void run();
	
} //Runnable �������̽�

class Sample1{
	
	public void prt(final int data) {
		System.out.println(data);
	}
	
	
	Runnable getRun(int su) { //final int su�� ���� �ǹ�, �ܺο��� �޾ƿ��� �� �״��
		
		//Ŭ���� ����� (�޼ҵ��̱� ������ private�� �ȵ�)
		class RunImple implements Runnable{

			@Override
			public void run() {
				System.out.println("run method ȣ��");
				System.out.println(su);
				
//				su+=20;  
			}
		} //runImple Ŭ����
		
		RunImple ins = new RunImple();
		
		return ins;
		
	}
}

public class NextTest5 {

	public static void main(String[] args) {
		Sample1 ins = new Sample1();
		Runnable r = ins.getRun(10);
		r.run();

		
		ins.prt(100);
	}

}
