package msa06;

class Person5{
	
	//�ʵ�   //(��ü ����) �ν��Ͻ� ����  //(Person����) �������
	String name;
	int age;
	String addr;
	String phone;
	
	//������	
	Person5(String name, int age,String addr,String phone){
		
		this(name,age,addr);  //������ this    //������ ȣ�� - �Ű����� 3��¥���� �ڱ� �����ڷ� �̵�  (�ݵ�� ù°�ٿ��� ȣ��)
		this.phone=phone;     //�������� this
		System.out.println("������4");
	}
	Person5(String name, int age,String addr){	
		this(name,age); 
		this.addr=addr;
		System.out.println(addr);
	}
	Person5(String name, int age){	
		this(name); 
		this.age = age;
		System.out.println("������2");
	}
	Person5(String name){
		this.name=name;
		System.out.println("������2");
	}
	
	//��� ���� ����ϴ� �޼ҵ�
	void print(){
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("addr : "+addr);
		System.out.println("phone : "+phone);
		
	}
	
	
}
public class ConstructorTest5{

	public static void main(String[] args) {
		
		Person5 p1 = new Person5("ȫ�浿",10,"����","01023"); 

		p1.print();
		
	}
}
