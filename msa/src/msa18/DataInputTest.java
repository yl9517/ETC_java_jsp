package msa18;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputTest {

	public static void main(String[] args) {

		try(DataInputStream dis = new DataInputStream(new FileInputStream("./d1.txt"))) {
			double a1 = dis.readDouble();
			int a2 = dis.readInt();
			String a3 = dis.readUTF();
			float a4 = dis.readFloat();
			
			System.out.println(a1+1);
			System.out.println(a2+1);
			System.out.println(a3+1);
			System.out.println(a4+10);  //자료 자체로 저장했기 떄문에 숫자로 받음.	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
