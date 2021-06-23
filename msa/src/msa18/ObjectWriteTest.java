package msa18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{  //Serializable : ��ü ����ȭ �Ҽ� �ֵ���

	private static final long serialVersionUID = 7338047009723415806L; //���� Ŭ������� �˷��ִ� �ø����ȣ

	private String name;
	private transient int age; //transient : ����ȭ�� ó�� ���ϴ� �ν��Ͻ� ����
	
//	private String addr;
	
	private static int su; //Ŭ���� ������ ����ȭ�� ����!!
	
	public Person(String name, int age,int su) {
		this.name = name;
		this.age = age;
		this.su=su;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", su="+su;
	}
	
}
public class ObjectWriteTest {

	public static void main(String[] args) {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./d2.txt"))) { 
																//���Ŭ������ ������
			
							//��ü�� ����   ��   ����ȭ(��ü�����Ʈ)
			oos.writeObject(new Person("hong", 20,100));
			System.out.println("���� ���� �Ϸ�");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
