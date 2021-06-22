package t17_io;

import java.io.FileReader;

public class FileReaderTest {

	public static void main(String[] args) {

		FileReader fr = null;
		try {
			fr = new FileReader("D:\\여름\\hello.txt");

			while(true) {
				int data = fr.read();
				if(data == -1) //문장 끝이면 -1출력
					break;
				System.out.print((char)data);
			}
			
		}catch (Exception e) {
			System.out.println("파일을 찾을 수가 없습니다."+e);
		}finally {
			if(fr!=null)
				try {
					fr.close();
				}catch (Exception e2) {
				}
		}

	}

}
