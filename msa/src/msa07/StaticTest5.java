package msa07;

class Sample1{
	
	static {  //Ŭ���� �о����� ��ó�� �ѹ� ����
		System.out.println("static �ʱ�ȭ ���"); 
	}
//	{  //���� ���ʿ�X, �����ڿ��� �ϸ� ��
//		System.out.println("�ʱ�ȭ ���");
//	}
	
	Sample1(){
		System.out.println("������!!");
	}
	
}

public class StaticTest5 {

	public static void main(String[] args) {
		Sample1 ins = new Sample1();  //
		Sample1 ins2 = new Sample1(); //�̹� ������ �ѹ� �о��� ������ static ������
		Sample1 ins3 = new Sample1();
	}

}
