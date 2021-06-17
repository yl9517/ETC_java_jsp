package msa14;

import java.io.IOException;
import java.util.Scanner;

import javax.imageio.IIOException;

public class ExceptionTest6 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int su = sc.nextInt();
		
		try {
			if(su<2)
				throw new IOException(); //���� ���� ���� ������
			System.out.println(su);
		}catch (Exception e) {
			System.out.println(e); //e.toString
		}
		
		finally { //������ ����
			System.out.println("done");
		}
	}

}
