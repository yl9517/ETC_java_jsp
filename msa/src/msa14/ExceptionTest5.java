package msa14;

import java.io.IOException;
import java.util.Scanner;

import javax.imageio.IIOException;

public class ExceptionTest5 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int su = sc.nextInt();
		
		
//		if(su>=2) 
//			System.out.println(su);
//		
//		else
//			System.out.println("�Է¿���");
		
		if(su<2)
			throw new IOException(); //���� ���� ���� ������
		System.out.println(su);
		
	}

}
