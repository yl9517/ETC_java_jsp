package msa15;
/*
 * StudentDTO -�й�,�̸�,���� �ޱ�
 * UserArray - �ڷ��߰�/����/����/���/��ȸ
 * 
 * 1.�Է�  2.���� 3.���� 4.��ȸ 5.��ü���� 6.����
 * 
 * �й��Է��ϼ���
 * �����й��� �ֽ��ϴ�
 * �̸��� �Է��ϼ���
 * ����
 * �Է¿Ϸ�
 * ��� �Է��ұ��?
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class StudentDTO{
	private int no;
	private String name;
	private int age;
	
	public StudentDTO(int no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}

	public int getno() {
		return no;
	}

	public void setno(int no) {
		this.no = no;
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
		return no + "\t " + name + "\t " + age;
	}

}

//UserArray - �ڷ��߰�/����/����/���/��ȸ
class UserArray{
	Scanner sc =new Scanner(System.in);
	
	ArrayList<StudentDTO> students = new ArrayList<StudentDTO>();
		
	//�߰�
	public void add() {
		while(true) {			
			System.out.print(">> �й� �Է� : ");
			int no = sc.nextInt();
			
			if(no <1) {
				System.out.println("0 ���ϴ� �Է� �� �� �����ϴ�.");
				break;
			}
			
			int findIndex = foundNo(no);	//�ߺ��й� ã��
					
			if(findIndex==no)
				System.out.println("���� �й��� �ֽ��ϴ�.");	
			else {		
				System.out.print(">> �̸� �Է� : ");
				String name =sc.next();
				System.out.print(">> ���� �Է� : ");
				int age = sc.nextInt();
				
				students.add(new StudentDTO(no, name, age)); //����Ʈ�� �߰�
				System.out.println("�Է� �Ϸ�");
				
				System.out.print("> ��� �Է��ұ��?(y/n) :");
				String num = sc.next();
				if(num.equals("n"))
					break;
				
			}	
		}
		
	} //end add
	
	//����
	public void modify() {
		while(true) {
			System.out.println(">> ������ �й� �Է� : ");
			int findIndex = foundNo(sc.nextInt());
			
			if(findIndex == -1) { //�����й� ����
				System.out.println("�ش� �й��� �����ϴ�.");
				break;
			}
			else { //���� �й� ����
				System.out.println(">> ������ ���� �Է� : ");
				students.get(findIndex).setAge(sc.nextInt());
				System.out.println("�����Ϸ�");
				
				System.out.print("> ��� �����ұ��?(y/n) :");
				String num = sc.next();
				if(num.equals("n"))
					break;
			}		
		}
	}	//end modify
	
	//����
	public void remove() {
		while(true) {
			System.out.println(">> ������ �й� �Է� : ");
			int findIndex = foundNo(sc.nextInt());
			
			if(findIndex == -1) { //�����й� ����
				System.out.println("�ش� �й��� �����ϴ�.");
				break;
			}
			else { //���� �й� ����
				students.remove(findIndex);
				System.out.println("�����Ϸ�");
				
				System.out.print("> ��� �����ұ��?(y/n) :");
				String num = sc.next();
				if(num.equals("n"))
					break;
			}		
		}
	}
	
	//��ȸ
	public void view() {
		while(true) {
			System.out.println(">> ��ȸ�� �й� �Է� : ");
			int findIndex = foundNo(sc.nextInt());
			
			if(findIndex == -1) { //�����й� ����
				System.out.println("�ش� �й��� �����ϴ�.");
				break;
			}
			else { //���� �й� ����
				System.out.println("�й� :"+students.get(findIndex).getno());
				System.out.println("�̸� :"+students.get(findIndex).getName());
				System.out.println("���� :"+students.get(findIndex).getAge());
				
				System.out.print("> ��� ��ȸ�ұ��?(y/n) :");
				String num = sc.next();
				if(num.equals("n"))
					break;
			}		
		}
	}
	public void allView() {
		while(true) {
			System.out.println("�й�\t �̸�\t ����");
			
			Iterator<StudentDTO> ita = students.iterator();
			
			while(ita.hasNext()) {
				System.out.println(ita.next());
			}
			
			System.out.print("> �ٽ� ���ðڽ��ϱ�?(y/n) :");
			String num = sc.next();
			if(num.equals("n"))
				break;
		}
	}
	
	
	//�й�ã��
	public int foundNo(int no) {
		
		int find = -1;
				
		for(int i=0; i<students.size(); i++) { //����Ʈ ũ�⸸ŭ �ݺ���
			if(students.get(i).getno()==no) {	//�й��� ���ٸ�
				find = i; //ã������ �й��� �ִ� �ε��� �����ֱ�
				break;
			}
		}
	
		return find;
	}
	
}

public class ArrayList_qestion {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		UserArray ua = new UserArray();
		
		while(true) {
		
			System.out.println("\n---------------------------[�޴�]---------------------------");
			System.out.println("1.�Է�   |  2.����   |  3.����   |  4.��ȸ   |  5.��ü����   | 6.���� ");
			System.out.println("-------------------------------------------------------------");
			int num = sc.nextInt();
			
			switch(num) {
			
			case 1:
				ua.add();
				break;
			case 2:
				ua.modify();
				break;
			case 3:
				ua.remove();
				break;
			case 4:
				ua.view();
				break;
			case 5:
				ua.allView();
				break;
			case 6:
				System.out.println("���� �Ͻðڽ��ϱ�?(��-y)");
				String result = sc.next();
				
				if(result.equals("y")) {
					System.out.println("���� �Ϸ�");
					System.exit(0);
				}
				else 
					continue;
			default :
				System.out.println("���ڸ� �߸� �Է��Ͽ����ϴ�.");
			} //switch
		}
	}

}
