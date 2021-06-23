package msa18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStreamTest {

	public static void main(String[] args) {

		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./d2.txt"))){	
			
						//바이트가 들어와서  ▶  역직렬화(바이트 → 객체)
			Object o = ois.readObject();
			
			if(o instanceof Person)
				o = (Person) o;
			else
				System.out.println("형변환 불가");
			
			System.out.println(o);
			// transient : 직렬화X,
			//static 정보는 저장 불가!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			
			
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
