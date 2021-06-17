package msa14;

import java.io.PrintStream;

class Job extends Thread{

	public Job(String str) {
		super(str);
	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(System.currentTimeMillis());
			try {
				sleep(1000);
			}catch (Exception e) {
				System.out.println(e);
			}
		} // end for
	}
}
	
public class SystemTest3 {

	public static void main(String[] args) {

		Job j = new Job("thread");
		j.start();
		
	}

}
