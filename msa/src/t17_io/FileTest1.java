package t17_io;

import java.io.File;

public class FileTest1 {

	public static void main(String[] args) {
		File f = new File("D:\\여름\\");
		
		String[] flists = f.list();
		
		for(String thisf:flists)
			System.out.println(thisf);
		
		File f2 = new File(f,"sample1");  //f위치에 sample1파일 생성
		
		boolean result =f2.mkdir(); //f2를 폴더로 
		if(result) 
			System.out.println("폴더 생성 성공");
		else
			System.out.println("폴더 생성 실패");
		
		
				System.out.println("===========================");
		
		
		File f3 = new File("D:\\여름\\sample1","hello.txt");  //sample폴더 안에 hello 파일 생성
		try {
			boolean result2= f3.createNewFile();
			if(result2)
				System.out.println("파일 생성 성공!");
			else
				System.out.println("파일성공 실패");		
		}catch (Exception e) {
			
		}
		

				System.out.println("===========================");
		
		if(f2.delete())
			System.out.println("폴더/파일 삭제 성공"); //내용물이 있으면 폴더 삭제 못함
		else
			System.out.println("폴더/파일 삭제 실패");
			
		
		
		
		
	}

}
