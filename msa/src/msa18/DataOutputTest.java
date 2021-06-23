package msa18;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputTest {

	public static void main(String[] args) {

		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("./d1.txt"))) {  // ./ = 현재 경로
			dos.writeDouble(10.2);
			dos.writeInt(10);
			dos.writeUTF("안녕하세요");
			dos.writeFloat(10.2f);
			System.out.println("파일 저장 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
