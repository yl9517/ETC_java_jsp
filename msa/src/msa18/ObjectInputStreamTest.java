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
			
						//����Ʈ�� ���ͼ�  ��  ������ȭ(����Ʈ �� ��ü)
			Object o = ois.readObject();
			
			if(o instanceof Person)
				o = (Person) o;
			else
				System.out.println("����ȯ �Ұ�");
			
			System.out.println(o);
			// transient : ����ȭX,
			//static ������ ���� �Ұ�!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			
			
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
