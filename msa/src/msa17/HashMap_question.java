package msa17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

//StudentDTO �й�(Ű��),�̸�,����
//userMap �߰�,����,����,���

// HashMap : �񵿱� / HashTable : ���� => �ΰ� ���X

class StudentDTO{
	private String hakNo;
	private String name;
	private int age;
	
	public StudentDTO(String hakNo, String name, int age) {
		super();
		this.hakNo = hakNo;
		this.name = name;
		this.age = age;
	}
	public String getHakNo() {
		return hakNo;
	}
	public void setHakNo(String hakNo) {
		this.hakNo = hakNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return hakNo + "\t " + name + "\t " + age;
	}
}

class UserMap{
	Scanner sc = new Scanner(System.in);
	HashMap<String, StudentDTO> list = new HashMap<String, StudentDTO>();
		
	//�߰�
	public void add() {
		
		System.out.print("�й� �Է� :");
		String hakNo = sc.next();
		System.out.print("�̸� �Է� :");
		String name = sc.next();
		System.out.print("���� �Է� :");
		int age = sc.nextInt();
		
		//�߰�
		list.put(hakNo, new StudentDTO(hakNo, name, age));	
	}
	
	//����
	public void del() {
		System.out.println("�й� �Է� :");		
		String hakNo = sc.next();
		
		if(findNo(hakNo)) {//�й�ã������
			list.remove(hakNo);
			
			System.out.println("�����Ϸ�");
		}else 
			System.out.println("�й��� �����ϴ�.");		
		
	}
	
	//����
	public void mod() {
		System.out.println("�й� �Է� :");		
		String hakNo = sc.next();
		
		if(findNo(hakNo)) {//�й�ã������
			System.out.print("������ ���� : ");
			list.get(hakNo).setAge(sc.nextInt());
			
			System.out.println("�����Ϸ�");
		}else 
			System.out.println("�й��� �����ϴ�.");		
		
	}
	
	//���
	public void printAll() {
		System.out.println("�й�\t �̸�\t ����");
		Iterator<StudentDTO> ita = list.values().iterator();
		
		while(ita.hasNext()) {
			System.out.println(ita.next());
		}
		
	}
	
	//�й�ã��
	public boolean findNo(String hakNo) {
		
		Iterator<String> ita = list.keySet().iterator();
		
		while(ita.hasNext()) {
			String key = ita.next();
			if(key.equals(hakNo)) {
				StudentDTO value = list.get(key);	
				return true;
			}
		}
		return false;

	}
}

public class HashMap_question {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		UserMap ua = new UserMap();
		while(true) {
			System.out.println("\n 1.�߰� | 2.���� | 3.���� | 4.��ü��ȸ");
			int num = sc.nextInt();
			
			switch(num) {
			
			case 1:
				ua.add();
				break;
			case 2:
				ua.del();
				break;
			case 3:
				ua.mod();
				break;
			case 4:
				ua.printAll();
				break;
			default :
				System.out.println("���ڸ� �߸� �Է��Ͽ����ϴ�.");
			} //switch
		}
	}

}
