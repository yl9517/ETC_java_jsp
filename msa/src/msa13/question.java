package msa13;

import java.util.Scanner;

/* �迭�� 5��
 *  �̸�,�̸���  => studentDTO Ŭ����
 * 	
 * ��Ʈ : @ (�������� split)
 * 
 * ���
 * �̸�	�̸���(id@������)	id	������
 * 
 * 
 */
class Student{
	private String name;
	private String email;
	private String id;
	private String domain;	

	public Student(String name, String email, String id, String domain) {
		this.name = name;
		this.email = email;
		this.id = id;
		this.domain = domain;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getId() {
		return id;
	}

	public String getDomain() {
		return domain;
	}	
	
}

public class question {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] arr= new Student[5];

		for(int i=0; i<5; i++) {
			System.out.print("�̸� : ");
			String name = sc.next();
			System.out.print("�̸��� : ");
			String email = sc.next();
			
			//���� �ڸ���
			String[] mail  = email.split("@"); 
			String id = mail[0];
			String domain = mail[1];
			
			arr[i] = new Student(name, email,id,domain); //�ν��Ͻ� �߰�
		}

		System.out.printf("%s\t %-25s\t %-10s\t %-10s","�̸�","�̸���","���̵�","������");
		System.out.println();
		for(Student index:arr) {
			System.out.printf("%s\t %-20s\t %-10s\t %-10s",index.getName(),index.getEmail(),index.getId(),index.getDomain());
			System.out.println();
		}

	}

}
