package msa07;
/*
 *  static �߰�����
 *  
 *  [Ŭ���� �޼���] (�����޼���,static �޼���)  :  �޼��� �̸� �տ� static�� ����
 *  ����� : Ŭ�����̸�.�޼ҵ�();
 *  
 *   	Static void prt(){
 *   		
 *   	}
 *  
 *   
 *   Ŭ���� �޼ҵ忡 ����� �� �ִ� ���� : ��������(�Ű����� ����), Ŭ�������� 
 *   		but �ν��Ͻ� ���� ��� �ȵ�!!!!!!!
 *   
 */
class Static2{
	
	static String addr="seoul";  //Ŭ���� ���� (�ʵ�)  //Ŭ������ �о����� �޸� �Ҵ�
	int age; //�ν��Ͻ� ���� (�ʵ�,�������)	//��ü�� ������� �� �޸� �Ҵ�. (static�� �ƴϹǷ� �ٷ� ȣ���Ҽ� ����)
	
	
	public static void prt(int su) { //Ŭ���� �޼ҵ�(�Ű�����) 		//�Ű�����->���������̱⵵ ��
		
		String name = "hong"; //�������� 	 //�޼ҵ尡 ȣ��ɶ� �������� �޼ҵ� �Ҵ� ��
		System.out.println("prt!!");
		System.out.println(addr);	//�Ҵ� �� �����̹Ƿ� ��� ����
		//System.out.println(age); //����(�޸� �Ҵ��� �ȵ� �����̹Ƿ�)
	}
	
}

public class StaticTest2 {

	public static void main(String[] args) {
		Static2.prt(10); //��ü ������ �ʰ� Ŭ������ �޼ҵ� �ٷ� ȣ��
		
		Static2 a2 = new Static2(); //�̶� static2��� Ŭ������ �ν��Ͻ� ���� �޸� �Ҵ��
		String gi = a2.addr;
		
	}

}
