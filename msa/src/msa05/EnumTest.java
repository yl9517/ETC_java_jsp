package msa05;
/*
 *  ������ (enum) : ��� �����θ� ���������� �̷���� ������ �ִ� Ÿ��
 */

enum Week{
	sun,mon,tue,wed,thu,fri,sat
}

public class EnumTest {

	public static void main(String[] args) {
		
		System.out.println(Week.sun);
		System.out.println(Week.fri);
			
		Week w = Week.wed;
		
		System.out.println(w);
	}

}
