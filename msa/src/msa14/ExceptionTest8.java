package msa14;

import java.io.IOException;
import java.util.Scanner;

class Sample2{
	public void prt(int su)  {
		try {
			if(su<0)
				throw new IOException("입력오류");
			System.out.println(su+"는 양수");
		}catch (Exception e) {
			System.out.println("받았어요.."+e);
			System.out.println("ioException catch 영역0");
		}
		finally {
			System.out.println("prt finally");
		}
	}
}

public class ExceptionTest8 {

	public static void main(String[] args) {
		Sample2 ins = new Sample2();

			ins.prt(-1);

	}

}
