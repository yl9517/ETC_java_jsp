package msa14;

import java.io.IOException;
import java.util.Scanner;

class Sample{
	public void prt(int su) throws IOException {
		if(su<0)
			throw new IOException("�Է¿���");
		System.out.println(su+"�� ���");
	}
}

public class ExceptionTest7 {

	public static void main(String[] args) {
		Sample ins = new Sample();

		try {
			ins.prt(-1);
		} catch (IOException e) {
			System.out.println(e);
			System.out.println("�����޼���...");
		}
		
		finally {
			System.out.println("���α׷� ����");
		}

	}

}
