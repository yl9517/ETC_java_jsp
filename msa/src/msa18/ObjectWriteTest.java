package msa18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{  //Serializable : 객체 직렬화 할수 있도록

	private static final long serialVersionUID = 7338047009723415806L; //같은 클래스라고 알려주는 시리얼번호

	private String name;
	private transient int age; //transient : 직렬화는 처리 안하는 인스턴스 변수
	
//	private String addr;
	
	private static int su; //클래스 변수는 직렬화를 못함!!
	
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
																//기반클래스가 들어가야함
			
							//객체가 들어가서   ▶   직렬화(객체→바이트)
			oos.writeObject(new Person("hong", 20,100));
			System.out.println("파일 쓰기 완료");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
