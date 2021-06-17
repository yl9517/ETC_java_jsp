package msa14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		
		//runTime Exception은 실행을 해봐야지만 오류가 발생하는지 알 수 있음		
		
		System.out.println(Integer.parseInt("123")+100); 
		System.out.println(Integer.parseInt("abc"));
		
	}

}
