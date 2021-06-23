package msa18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {

	public static void main(String[] args) {

		try(BufferedReader br =new BufferedReader(new FileReader("./hello.txt"))) {
			
			String str=null;
			while((str=br.readLine())!=null) { //���� �ڷᰡ null�� �ƴ� ���� ���
				System.out.println(str);
			}
			
		}catch (IOException e) {
			// TODO: handle exception
		}

	}

}
