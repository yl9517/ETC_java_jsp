package msa14;

import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest10 {

	public static void main(String[] args) throws IOException {
		try {
			
			int[] arr = {1,2,3};
			
			for(int i=0; i<5; i++) {
				System.out.println(arr[i]);
			}
			
		}catch (Exception e) {
			System.out.println("배열 오류");
		}
		
	}

}
