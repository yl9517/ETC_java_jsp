package msa05;
/*
 *     Ŭ���� : ���� ������ ���ܿ� ���ϴ� �Ӽ��� ������ ����(��ü�� ����� ���� Ʋ)
    	��ü : Ŭ������ �ν��Ͻ�ȭ(��üȭ) �� �� (Ŭ������ �޸𸮸� �����ϸ� ��ü ����)
   
 */
class Person{
	
	String name;
	int age;
	String addr;
	
}
public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		//pq reference variable       new Pserson() : ��ü,�ν��Ͻ�
			p1.name="�̿���";
			p1.age=24;
			p1.addr="���";
			
		Person p2 = new Person();
			p2.name="�̿���";
			p2.age=25;
			p2.addr="����";

		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.addr);
		System.out.println("==========");
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.addr);
	
			

	}

}