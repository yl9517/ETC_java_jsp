package msa14;

import java.io.PrintStream;
import java.util.Scanner;

public class SystemTest4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("����Է�");
			String yn = sc.next();
			
			if(yn.equals("n"))
				System.exit(0); // jvm ��������
			
		} //while
//		System.out.println("done"); //������ �̹� �����߱⶧���� ����
		
	}

}
