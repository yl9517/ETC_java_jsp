package t17_io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("D:\\여름\\hello.txt");  //혹은 "D:/여름/hello.txt"
			fw.write("hello");
			fw.write("만나서 반갑습니다.");
			
			System.out.println("파일 입력 완료");
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			if(fw!=null) { //객체가 null이 아니라면
				try {
					fw.close(); //무조건 닫아줘야하므로 finally 안에 쓰기
				}catch (Exception e2) {
					
				}
			}
		}

	}

}
