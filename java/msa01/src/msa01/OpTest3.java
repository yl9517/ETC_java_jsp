package msa01;
/*
 *  ���� : ����+���� , ����+����   //���ڰ� �켱�����̸� ���ڿ��� �ν��� (��������ϰ� ������ ��ȣ����)
 *  
 * 
 */
public class OpTest3 {
	
	public static void main(String[] args) {
		
		System.out.println(10+20);  //�������
		System.out.println("aa"+"bbb"); //���ڿ�+���ڿ� => ����
		
		System.out.println(10+20+"�Դϴ�"); // 30�Դϴ�
		System.out.println("�����"+10+20); // �Դϴ�1020 
		System.out.println("�����"+(10+20)); // �Դϴ�30
		System.out.println(10==10.0f); // true  //���Ŀ� ���� ��X, ���� ���� ���� ��o
		
	}

}
