package msa17;


import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

class Person{
	private int no;
	private String name;
	private String jumin;
		
	public Person(int no, String name, String jumin) {
		this.no=no;
		this.name = name;
		this.jumin = jumin;
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	@Override
	public String toString() {
		return no + "\t " + name + "\t " + jumin;
	}	
	
}

class PersonPro{
	Scanner sc = new Scanner(System.in);
	
	
	Hashtable<Integer, Person> people = new Hashtable<Integer, Person>();
	
	int i=1;	
	public String add(String name,String jumin) {
		String result = "�ش� ��ȣ�� �����ϴ�.";
		
		people.put(i, new Person(i, name, jumin));
		i++;
		result = "�߰� �Ϸ�";
		
		return result;
	}
	public String del(int index) {
		String result = "�ش� ��ȣ�� �����ϴ�.";
		
		if(foundNo(index)) {
			people.remove(index);
			result = "���� �Ϸ�";
		}
		
		return result;
	}
	public String modify(int index) {
		String result = "�ش� ��ȣ�� �����ϴ�.";
		
		if(foundNo(index)) {
			System.out.print("1.�̸� ����  | 2.�ֹι�ȣ ���� >> ");
			int num = sc.nextInt();
			
			if(num==1) {
				System.out.print("���� �� �̸� : ");
				people.get(index).setName(sc.next());
				result = "���� �Ϸ�";
			}
			else if(num==2) {
				System.out.print("���� �� �̸� : ");
				people.get(index).setJumin(sc.next());
				result = "���� �Ϸ�";
			}
			
		}
		
		return result;
	}
	
	public void printAll() {
		

		System.out.println("��ȣ\t �̸�\t �ֹι�ȣ");
		
		Enumeration<Person> ep = people.elements();
		
		while(ep.hasMoreElements()) {
			System.out.println(ep.nextElement());
		}
		

		
	}
	
	public boolean foundNo(int index) {
		boolean found = false;
		
		if(people.get(index) != null) 
			found = true;
			
		return found;
	}
	
	
}

public class HashTable_question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PersonPro pp = new PersonPro();
		int i=1;
		
		while(true) {
			System.out.println("\n-----------------------------");
			System.out.println("1.�߰�  | 2.����  | 3.����  | 4.��ȸ");
			int num = sc.nextInt();
			
			if(num==1) {
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("�ֹι�ȣ : ");
				String jumin = sc.next();
				
				System.out.println(pp.add(name, jumin));
				
				//ó������ boolean���� �޾ƿͼ� ���⼭ ó����� ����ϴ°� �� ����. ���߿� �ð� �Ǹ� �����ϱ�
				
			}
			else if(num==2) {
				System.out.print("������ ��ȣ : ");
				int index = sc.nextInt();
				
				System.out.println(pp.del(index));
				
			}
			else if(num==3) {
				System.out.print("������ ��ȣ : ");
				int index = sc.nextInt();
				
				System.out.println(pp.modify(index));
				
			}
			else if(num==4) 
				pp.printAll();
		}

	}

}
