package msa07;
/*
 * [static] - Ŭ���� �ε� ��(�о��� ��) �޼ҵ� ������ �޸� �Ҵ�
 * 
 * Ŭ���� ����, ��������, static ����
 *  ���� : static Ÿ�� ����;
 *  ��� : Ŭ�����̸�.����
 *  	
 */
class Static1{
	static int su=10; //Ŭ���� ����,��������, static ����
}

public class StaticTest {

	public static void main(String[] args) {

		Static1 ins = new Static1();
		Static1 ins2 = new Static1();
		Static1 ins3 = new Static1();

		ins.su=10;
		ins2.su=100;
		ins3.su=1000;
		
		System.out.println(ins.su);  //1000
		System.out.println(ins2.su);  //1000
		System.out.println(ins3.su);  //1000
		System.out.println(Static1.su);  //1000  //static�� ���� �̷��� ������. �� ������ �޸��Ҵ�
	}

}
