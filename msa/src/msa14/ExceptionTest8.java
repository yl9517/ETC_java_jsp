package msa14;

import java.io.IOException;
import java.util.Scanner;

class Sample2{
	public void prt(int su)  {
		try {
			if(su<0)
				throw new IOException("�Է¿���");
			System.out.println(su+"�� ���");
		}catch (Exception e) {
			System.out.println("�޾Ҿ��.."+e);
			System.out.println("ioException catch ����0");
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
