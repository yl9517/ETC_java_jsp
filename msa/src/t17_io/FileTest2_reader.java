package t17_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileTest2_reader {

	public static void main(String[] args) {

		//한꺼번에 읽어오는 기능
		BufferedReader br = null;
	
		try {
			br = new BufferedReader(new FileReader("D:\\여름\\myboard\\myfav2.txt"));

			String str = "";
			while((str = br.readLine())!=null) {
				
//				str = br.readLine();
//				
//				if(str==null) //문자끝나면 null출력되므로
//					break;		
				// 이걸 바로 whiel문 조건문에 넣기
				
				System.out.println(str);
			}
			
		}catch (Exception e) {
			System.out.println("해당 파일 없습니다"+e);
		}finally {
			if(br!=null)
				try {
					br.close();
				}catch (Exception e2) {
				}
		}
		
	}

}
