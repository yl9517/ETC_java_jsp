package msa14;

import java.io.IOException;
import java.util.Scanner;

class Sample{
	public void prt(int su) throws IOException {
		if(su<0)
			throw new IOException("입력오류");
		System.out.println(su+"는 양수");
	}
}

public class ExceptionTest7 {

	public static void main(String[] args) {
		Sample ins = new Sample();

		try {
			ins.prt(-1);
		} catch (IOException e) {
			System.out.println(e);
			System.out.println("오류메세지...");
		}
		
		finally {
			System.out.println("프로그램 종료");
		}

	}

}
