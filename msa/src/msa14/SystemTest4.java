package msa14;

import java.io.PrintStream;
import java.util.Scanner;

public class SystemTest4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("계속입력");
			String yn = sc.next();
			
			if(yn.equals("n"))
				System.exit(0); // jvm 정상종료
			
		} //while
//		System.out.println("done"); //위에서 이미 종료했기때문에 에러
		
	}

}
