package msa06;

class Student3{
	
	//�ʵ�
	String name;
	int age;
	String juso;
	
	//������	
		// [�����ε�] : �̸��� ������ �Ű�����Ÿ���� (���� ����) �ϳ��� �ٸ��� �ٸ� �޼ҵ� ����� �ϴ� ��	
	Student3(String name, int age,String juso){
		
		this.name = name; // this : ��������  (�ڱ� �ڽ��� ��ü�� ����Ŵ)
		this.age = age;
		this.juso=juso;
	}
	Student3(String name, int age){
		this.name = name; 
		this.age = age;
	}
	Student3(String name,String juso){
		this.name = name; 
		this.juso=juso;
	}
	
	
	//�޼ҵ�
	void print() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("�ּ� : "+juso);
	}
}
public class ConstructorTest3{

	public static void main(String[] args) {
		Student3 s1 = new Student3("ȫ�浿", 10, "����");
		Student3 s2 = new Student3("ȫ���", 20, "���");
		Student3 s3 = new Student3("ȫ���", 30, "����");
		
		s1.print();
		s2.print();
		
	}
}