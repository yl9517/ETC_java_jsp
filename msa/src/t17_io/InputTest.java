package t17_io;

import java.io.InputStream;
import java.io.InputStreamReader;

public class InputTest {

	public static void main(String[] args) {
		
//		InputStream is = System.in; //InputStream = 바이트 단위로 읽어옴
//		InputStreamReader isr = new InputStreamReader(is);  //InputStreamReader = 바이트정보를 문자단위로 바꿔줌
		
		InputStreamReader isr = new InputStreamReader(System.in); // = reader
		
		
		System.out.print("메세지 입력:");
		
		while(true) {
			try {
				char ch = (char) isr.read();
				
				if(ch=='.')
					break;
				System.out.print(ch);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
