package t17_io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputTest2 {

	public static void main(String[] args) {
		
//		InputStreamReader isr = new InputStreamReader(System.in);  // InputStreamReader�� Reader�� ��ӹ޾��� �� reader��ɤ�
//		BufferedReader br = new BufferedReader(isr);
		
		//������ ���� : ���ڷ��̼� ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("������ �Է�");
		while(true) {
			
			//���ٴ����� �о�� :readLine()
			try {
				String str = br.readLine();
				
				System.out.println(str);
				if(str.equals("bye"))
					break;
			}catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}

}
