package msa06;
/*
 *  Constructor            *  ��ü�� ����� ���ؼ��� �ݵ�� �����ڰ� �ʿ�
 *  
 *  [������] ��ü�� ����� ��  (�ٷ� �ʱ�ȭ �����ֱ� ���ؼ� ����)
 *     �� Ŭ���� �̸��� ���� �̸�!! ����Ÿ�� ����!! 
 *     
 *    ȣ����� : new �Ҷ� �ڵ����� ȣ��
 *    ������� : ��ü�� �ν��Ͻ� �������� �ʱ�ȭ �ϱ����� ��ü�� ��������鼭 �ؾ��� ���
 *    
 */

class Student{
	//�ʵ�
	String name;
	// ��ü�� ����� ���ؼ��� �ݵ�� �����ڰ� �ʿ�
	//�����ڰ� �ƿ� ���� �� �� �����ڰ� �⺻���� ����!!! (�� ������ �ʼ�)
	
	//������
	Student(String n){
		name=n;
	}
}
public class ConstructorTest{

	public static void main(String[] args) {
		Student s1 = new Student("hong gil dong");
		System.out.println(s1.name);
		
		//Student s2 = new Student();   //�ش��ϴ� �����ڰ� ��� ����
	}
}
