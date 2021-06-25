package msa20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class MemberDTO{
	private String hakNo;
	private String name;
	private int age;
	
	public MemberDTO() {
		
	}
	
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
class MemberService{
	private List<MemberDTO> arr ;
	
	public MemberService() {
		arr= Collections.synchronizedList(new ArrayList<MemberDTO>());
		//collections = ����ȭó��  (��������� ���� �� �ֵ���)
	}
	
	//�߰�
	public boolean insert(MemberDTO md) throws q_DuplicateException {
		
		if(checkNo(md.getHakNo())) { //�ߺ��� ������
			throw new q_DuplicateException();
		}

		return arr.add(md);

	}
	//����
	public boolean delete(String hakNo) {
		for(MemberDTO sel:arr) {
			if(sel.getHakNo().equals(hakNo)) 
				return arr.remove(sel);
		}
		return false;
	}
	//����
	public boolean modify(String hakNo,int age) {
		for(MemberDTO sel:arr) {
			if(sel.getHakNo().equals(hakNo)) {
				sel.setAge(age);
				return true;
			}
			
		}
		return false;
		
	}
	
	//���� ���
	public MemberDTO selectPrint(String hakNo) throws q_NoDataException {
		
		for(MemberDTO sel:arr) {
			if(sel.getHakNo().equals(hakNo)) 
				return sel;
		}
		throw new q_NoDataException();
	}
	
	//��ü���
	public List<MemberDTO> allPrint() {
		return arr;
	}
	
	//�й�üũ
	public boolean checkNo(String hakNo) {
//		return list.contains(hakNo); //��� �ǳ�?
		for(MemberDTO index:arr) {
			if(index.getHakNo().equals(hakNo))
				return true;
		}
		return false;
	}
	
	
	
}
public class question {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberMenu mm = new MemberMenu(sc);
		
		while(true) {
			System.out.println("=====================[����]========================");
			System.out.println("1.�߰�  | 2.����  | 3.����  | 4.���  | 5.��ü���  | 6.����");
			System.out.println("==================================================");
	
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

			
		}//while
		
	}
}

class MemberMenu{
	private Scanner sc;
	MemberService service = new MemberService();
	
	public MemberMenu(Scanner sc) {
		this.sc=sc;
	}
	
	public void one() {
		while(true) {
			boolean result = false;
			
			System.out.println("------[�Է�]------");
			System.out.println("ȸ����ȣ�� �Է��Ͻÿ�");
			String hakNo = sc.next();
	
			if( service.checkNo(hakNo)) {	
				System.out.println("�̹� �����ϴ� ȸ���Դϴ�.");
			}
			else {
				System.out.println("�̸��� �Է��Ͻÿ�");
				String name = sc.next();
				System.out.println("���̸� �Է��Ͻÿ�");
				int age = sc.nextInt();
				
				try {
					result = service.insert(new MemberDTO(hakNo, name, age));
				}catch (q_DuplicateException  e) {
					System.out.println(e);
				}
				
				if(result)
					System.out.println("�Է¼���");
				else
					System.out.println("�Է� ����");
			}
			
			System.out.println("��� �Է�?");
			String yn = sc.next();	
	//		if("y".equalsIgnoreCase(yn)) //��ҹ��� �����ϰ� yn�� YȤ�� y���
	//			one();	//�����Լ� recurisive call >> �������� ���α׷�, while�� �� ����
			
			if("n".equalsIgnoreCase(yn))//��ҹ��� �����ϰ� yn�� NȤ�� n���
				break;
		} //while
	} //one
	
	//����
	public void two() {
		System.out.println("������ ȸ����ȣ : ");
		String hakNo = sc.next();
		
		if(service.delete(hakNo)) 
			System.out.println("�ڷᰡ ���� �Ǿ����ϴ�.");
		else
			System.out.println("�ڷ� ���� ����");
	}
	
	//����
	public void three() {
		System.out.println("������ ȸ����ȣ : ");
		String hakNo = sc.next();
		
		if(service.checkNo(hakNo)) {
			System.out.println("������ ���� :");
			int age = sc.nextInt();
			
			service.modify(hakNo, age);
		}
		else {
			System.out.println("�ڷ� ���� ����");
		}
	}
	
	public void four() {
		while(true) {
			System.out.println("��ȸ�� ȸ����ȣ : ");
			String hakNo = sc.next();
			try {
				MemberDTO dto = service.selectPrint(hakNo);
				System.out.println("ȸ����ȣ : "+dto.getHakNo());
				System.out.println("�̸� : "+dto.getName());
				System.out.println("���� : "+dto.getAge());
			}catch (Exception e) {
				System.out.println(e);
			}
			
			System.out.println("��� �Է�?");
			String yn = sc.next();	
			if("n".equalsIgnoreCase(yn))//��ҹ��� �����ϰ� yn�� NȤ�� n���
				break;
		}
	}
	
	public void five() {
		//��ü����	
		List<MemberDTO> list = service.allPrint();
		System.out.println("�й�\t �̸�\t ����");
		for(MemberDTO dto:list)
			System.out.println(dto);
	}
	
}