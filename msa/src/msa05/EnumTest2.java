package msa05;
/*
 *  ������ (enum) : ��� �����θ� ���������� �̷���� ������ �ִ� Ÿ��
 */

enum Week1{
	sun,mon,tue,wed,thu,fri,sat
}

public class EnumTest2 {

	public static void main(String[] args) {
		Week1 w = Week1.sun;
		
		switch(w) {
		case sun:
			System.out.println("�Ͽ����Դϴ�");
			break;

		case mon :
			System.out.println("�������Դϴ�");
			break;
		default: 
			System.out.println("������ �����Դϴ�");
		}
		
	}

}
