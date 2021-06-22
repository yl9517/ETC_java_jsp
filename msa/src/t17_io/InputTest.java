package t17_io;

import java.io.InputStream;
import java.io.InputStreamReader;

public class InputTest {

	public static void main(String[] args) {
		
//		InputStream is = System.in; //InputStream = ����Ʈ ������ �о��
//		InputStreamReader isr = new InputStreamReader(is);  //InputStreamReader = ����Ʈ������ ���ڴ����� �ٲ���
		
		InputStreamReader isr = new InputStreamReader(System.in); // = reader
		
		
		System.out.print("�޼��� �Է�:");
		
		while(true) {
			try {
				char ch = (char) isr.read();
				
				if(ch=='.')
					break;
				System.out.print(ch);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
