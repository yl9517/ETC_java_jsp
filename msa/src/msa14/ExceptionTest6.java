package msa14;

import java.io.IOException;
import java.util.Scanner;

import javax.imageio.IIOException;

public class ExceptionTest6 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int su = sc.nextInt();
		
		try {
			if(su<2)
				throw new IOException(); //오류 직접 만들어서 던지기
			System.out.println(su);
		}catch (Exception e) {
			System.out.println(e); //e.toString
		}
		
		finally { //무조건 실행
			System.out.println("done");
		}
	}

}
