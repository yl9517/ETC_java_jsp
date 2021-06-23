package msa18;

import java.io.FileWriter;

public class FileWriterTest {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		try {
			fw= new FileWriter("./hello.txt");
			
			fw.write("hello hello");
			
			System.out.println("파일을 생성했습니다.");
			
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(fw!=null)
				try {
					fw.close();
				}catch (Exception e2) {

				}
		}

	}

}
