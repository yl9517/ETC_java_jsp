package msa14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true) {
			try {
				System.out.println("숫자1");
				int su = Integer.parseInt(br.readLine());
				System.out.println("숫자2");
				int su2 = Integer.parseInt(br.readLine());
				
				System.out.println(su/su2);
			}catch (Exception e) {
				System.out.println("잘못입력");
			}
		}
		
	}

}
