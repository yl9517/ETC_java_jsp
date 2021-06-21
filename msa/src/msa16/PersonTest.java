package msa16;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Person p = new Person("hong", 20);
		System.out.println(p);

		
		MemberArrayList ma = new MemberArrayList();
		
		//���� �ֱ�
		ma.addMember("hoei", 84);
		
		//��ü memarray�� ��ü ����  addmember �޼ҵ带 ȣ���ؼ� �ڷ� 4�� �Է�
		ma.addMember(new Person("kim", 10));
		ma.addMember(new Person("lee", 20));
		ma.addMember(new Person("park", 30));
		ma.addMember(new Person("kim", 40));
		
		
		//��ü printAll �߰��� ������ ���
		ma.printAll();
		
		//kim�̶�� �ڷḸ ���̵��� �ڷ����1
		 ma.print("kim");
		 
		 System.out.println("----------");
		 
		 
		 //kim�̶�� �ڷ���� �� ����Ʈ�� ��� �ڷ����2

		
		 for(Person p1:ma.print("kim")) {
			 System.out.println(p1.getName()+", "+p1.getAge());
		}
		
		//����
		 boolean r = ma.removePerson(new Person("lee", 20));
		 if(r)
			 System.out.println("���� ����");
		 else
			 System.out.println("���� ����");
		 
		 //����
		 r = ma.modifyPerson(new Person("kim", 10),new Person("kim2",100));
		 if(r)
			 System.out.println("���� ����");
		 else
			 System.out.println("���� ����");
	}
}
