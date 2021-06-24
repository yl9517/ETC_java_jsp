package msa19;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Ŭ���� 4�� - MemberDTO, MemberSerive(���) , MemberTest(����ȭ��) , MemberMenu(����ȭ��)
//����ó��, if(age<0) throw new Exception
//�й�,�̸�,���� arraylist

class MemberDTO{
	private String hakNo;
	private String name;
	private int age;
	public MemberDTO(String hakNo, String name, int age) {
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

class MemberSerive{
	ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
	//�߰�
	public void insert(MemberDTO md){
		list.add(md);
	}
	//����
	public void del(int index) {
		list.remove(index);
	}
	
	//����
	public void update(int index,int age) {
		list.get(index).setAge(age);
	}
	
	//�������
	public MemberDTO selectPrint(int index) {
		 return list.get(index);
				
	}
	
	//��ü���
	public ArrayList<MemberDTO> allPrint() {
		return list;
	}
	
	//�й�ã��
	public int findNo(String hakNo) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getHakNo().equals(hakNo)) 
				return i;	
		}
		return -1;
	}
}

public class question {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MemberMenu mm = new MemberMenu();
		
		while(true) {
			System.out.println("=====================[����]========================");
			System.out.println("1.�߰�  | 2.����  | 3.����  | 4.���  | 5.��ü���  | 6.����");
			System.out.println("==================================================");
	
			try {
				System.out.print("���� >> ");
				int num = sc.nextInt();
				
				switch(num) {
				case 1 :
					mm.one();
					break;
				case 2 :
					mm.two();	
					break;		
				case 3 :
					mm.three();		
					break;		
				case 4 :
					mm.four();	
					break;		
				case 5 :
					mm.five();
					break;
				case 6 :
					System.out.println("���α׷� ����");
					System.exit(0);
				default :
					System.out.println("��ȣ�� �߸� �Է��Ͽ����ϴ�.");
				}
			}catch (Exception e) {
				 System.out.println("���ڸ� �Է����ּ���");
			}
			
		}//while
		
	}
}

class MemberMenu{
	MemberSerive ms = new MemberSerive();
	Scanner sc = new Scanner(System.in);
	
	//�߰�
	public void one() {			
		System.out.print("�й� �Է� : ");
		String hakNo = sc.next();
		
		int found = ms.findNo(hakNo); //�ߺ��˻�
		
		if(found!=-1) { //�й� ����
			System.out.println("�̹� �����ϴ� �й��Դϴ�.");
		}else { // �й� ����
			System.out.print("�̸� �Է� : ");
			String name = sc.next();
			
			try {
				System.out.print("���� �Է� : ");
				int age = sc.nextInt();
				if (age<0)
					throw new Exception();				
				ms.insert(new MemberDTO(hakNo, name, age));

			}catch (Exception e) {
				System.out.println("���̸� �ٽ� Ȯ�����ּ���.");
				sc.nextLine(); //�����Ⱚ ������
			}
		}
		
	}
	
	//����
	public void two() {
		System.out.print("�й� �Է� : ");
		String hakNo = sc.next();
		
		int found = ms.findNo(hakNo); //�й��˻�
		if(found!=-1) { //�й� ����
			ms.del(found);
		}else { // �й� ����
			System.out.println("�������� �ʴ� �й��Դϴ�.");
		}
		
	}
	
	//����
	public void three() {
		System.out.print("�й� �Է� : ");
		String hakNo = sc.next();
		
		int found = ms.findNo(hakNo); 
		
		if(found!=-1) { //�й� ����
			try {
				System.out.print("���� �Է� : ");
				int age = sc.nextInt();
				if (age<0)
					throw new Exception();				
				ms.update(found, age);
	
			}catch (Exception e) {
				System.out.println("���̸� �ٽ� Ȯ�����ּ���.");
				sc.nextLine(); //�����Ⱚ ������
			}
		}else { // �й� ����
			System.out.println("�������� �ʴ� �й��Դϴ�.");
		}
	}
	
	//�������
	public void four() {
		System.out.print("�й� �Է� : ");
		String hakNo = sc.next();
		
		int found = ms.findNo(hakNo); 
		
		if(found!=-1) { //�й� ����			
			//���
			System.out.println("�й�\t �̸�\t ����");
			System.out.println(ms.selectPrint(found));
			
		}else { // �й� ����
			System.out.println("�������� �ʴ� �й��Դϴ�.");
		}
		
	}
	
	//��ü���
	public void five() {
		ArrayList<MemberDTO> members = ms.allPrint();
		System.out.println("�й�\t �̸�\t ����");
		for(MemberDTO printAll:members)
			System.out.println(printAll);
	}
	
}
