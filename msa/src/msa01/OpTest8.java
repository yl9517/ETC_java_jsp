package msa01;

public class OpTest8 {

	public static void main(String[] args) {
		
		//���׿�����
		// ++a : ����������
		// a++ : ����������
		
		int x=10;  
		int y=++x;  //  (++x => x=x+1;�̹Ƿ�  x=11) "x�� ++�� ��"�� y�� ���� 
		System.out.println(x);
		System.out.println(y);
		
		x=10;
		y=x++;      //"y�� x�� ���� ����" �� x=x+1
		System.out.println(x);
		System.out.println(y);
		
		
		x=10;
		y=--x; //x���� ��� �� ����
		System.out.println(x);
		System.out.println(y);

		x=10;
		y=x--; //���� ���� �� x���
		System.out.println(x);
		System.out.println(y);
		

	}

}
