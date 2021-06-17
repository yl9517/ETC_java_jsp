package msa14;

import java.io.IOException;
import java.util.Scanner;

import javax.imageio.IIOException;

public class ExceptionTest5 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int su = sc.nextInt();
		
		
//		if(su>=2) 
//			System.out.println(su);
//		
//		else
//			System.out.println("입력오류");
		
		if(su<2)
			throw new IOException(); //오류 직접 만들어서 던지기
		System.out.println(su);
		
	}

}
