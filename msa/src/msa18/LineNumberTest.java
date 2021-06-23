package msa18;

import java.io.FileReader;
import java.io.LineNumberReader;

public class LineNumberTest {

	public static void main(String[] args) {

		try(LineNumberReader r = new LineNumberReader(new FileReader("./hello.txt"));){
			while(true) {
				String content = r.readLine();
				if(content==null)
					break;
				System.out.println(r.getLineNumber()+" : "+ content); //getLineNumber() : 번호 출력
			
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
