package msa06;

class Person4{
	
	//�ʵ�
	String name;
	int age;
	String addr;
	String phone;
	
	//������	
	Person4(String name, int age,String addr,String phone){
		
		this(name,age,addr);  //������ ȣ��!! - �Ű����� 3��¥���� �ڱ� �����ڷ� �̵�
		//this.phone=phone;
		System.out.println("������4");
	}
	Person4(String name, int age,String addr){	
//		this.name = name; 
//		this.age = age;
//		this.addr=addr;
		System.out.println("������3");
	}
	Person4(String name, int age){	
		this.name = name;
		this.age = age;
		System.out.println("������2");
	}
	
}
public class ConstructorTest4{

	public static void main(String[] args) {
		
		Person4 p1 = new Person4("ȫ�浿",10,"����","01023"); 
		//[���]
		//������3
		//������4
		
	}
}
