package msa14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest3 {

	public static void main(String[] args) throws IOException {
		
		
		//runTime이 아닌 Exception은 바로 빨간불 나타남 -> 그래서 checked Exception 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input name");
		String name = br.readLine();
		
		// throws = 직접개입x 
		// try...catch = 직접 처리
		String data=null;
		System.out.println(data.toString());
	}

}
