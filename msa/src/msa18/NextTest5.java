package msa18;

interface Runnable{
	
	void run();
	
} //Runnable 인터페이스

class Sample1{
	
	public void prt(final int data) {
		System.out.println(data);
	}
	
	
	Runnable getRun(int su) { //final int su와 같은 의미, 외부에서 받아오는 값 그대로
		
		//클래스 숨기기 (메소드이기 때문에 private은 안됨)
		class RunImple implements Runnable{

			@Override
			public void run() {
				System.out.println("run method 호출");
				System.out.println(su);
				
//				su+=20;  
			}
		} //runImple 클래스
		
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
