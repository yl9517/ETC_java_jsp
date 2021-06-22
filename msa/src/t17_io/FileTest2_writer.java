package t17_io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileTest2_writer {

	public static void main(String[] args) {

		BufferedWriter bw = null;
		File f = new File("D:\\여름\\myboard");
		
		
		try {
			boolean result = f.mkdir(); //폴더 생성
			if(result)
				System.out.println("폴더 생성완료");
			else
				System.out.println("폴더 생성실패");
			
			
//			bw = new BufferedWriter(new FileWriter("D:\\여름\\myboard/myfav.txt"));
			bw = new BufferedWriter(new FileWriter(new File(f,"myfav2.txt"),true));  //true = 파일이 이미 있으면 이어서 쓰
			
			bw.write("호올리 모라는거야");
			bw.write("만나서 방가");
			bw.newLine();
			bw.write("저의 이름은");
			bw.newLine();
			bw.write("홍길동입니다.");
			System.out.println("파일 쓰기 완료");
			
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			if(bw!=null)
				try {
					bw.close();
				}catch (Exception e2) {
				}
		}
		
		
		
	}

}
