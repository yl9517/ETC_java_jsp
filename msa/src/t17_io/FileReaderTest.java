package t17_io;

import java.io.FileReader;

public class FileReaderTest {

	public static void main(String[] args) {

		FileReader fr = null;
		try {
			fr = new FileReader("D:\\����\\hello.txt");

			while(true) {
				int data = fr.read();
				if(data == -1) //���� ���̸� -1���
					break;
				System.out.print((char)data);
			}
			
		}catch (Exception e) {
			System.out.println("������ ã�� ���� �����ϴ�."+e);
		}finally {
			if(fr!=null)
				try {
					fr.close();
				}catch (Exception e2) {
				}
		}

	}

}
