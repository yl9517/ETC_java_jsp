package t17_io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("D:\\����\\hello.txt");  //Ȥ�� "D:/����/hello.txt"
			fw.write("hello");
			fw.write("������ �ݰ����ϴ�.");
			
			System.out.println("���� �Է� �Ϸ�");
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			if(fw!=null) { //��ü�� null�� �ƴ϶��
				try {
					fw.close(); //������ �ݾ�����ϹǷ� finally �ȿ� ����
				}catch (Exception e2) {
					
				}
			}
		}

	}

}
