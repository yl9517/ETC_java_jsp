package t17_io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputTest2 {

	public static void main(String[] args) {
		
//		InputStreamReader isr = new InputStreamReader(System.in);  // InputStreamReader가 Reader를 상속받았음 ▶ reader기능ㅇ
//		BufferedReader br = new BufferedReader(isr);
		
		//디자인 패턴 : 데코레이션 기법
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("데이터 입력");
		while(true) {
			
			//한줄단위로 읽어옴 :readLine()
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
