package msa17;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {

		Random rnd = new Random();	//0부터 시작
		Random rnd2 = new Random(System.currentTimeMillis());
		
		for(int i=0; i<20; i++)
			System.out.print(rnd2.nextInt(5)+" "); //0~4까지 (0부터시작_
		
		System.out.println("------------------------");
		
		for(int i=0; i<20; i++)
			System.out.print(rnd.nextInt(5)+1+" "); //1~5까지
		
		
		
	}

}
