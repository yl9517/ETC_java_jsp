package msa10;

public class SuperSubTest1 {

	public static void main(String[] args) {

		Super1 ins = new Sub1(); //up Casting
		ins.prt();
		ins.view();
		 
//		Sub1 ins2 = (Sub1) new Super1(); //ClassCastException Ŭ���� ��ȯ ����
		
		Super1 ins3 = new Sub1();
		//super�� ����ų�� �ִ� ins3 / sub���� �޸� �Ҵ�
		Sub1 ins4 = (Sub1) ins3;
		
		ins4.draw();
		ins4.prt();
		ins4.view();
		

		//������ ������ ���� �����Ƿ� �ٷ� ����ȯ ��������
		//����ȯ �������� üũ (instanceof)
		Super1 ins5 = new Super1();
		
		if (ins5 instanceof Sub1) {  //super1������ ins5�� sub1���·� �ٲ� �� �ִ�?
			Sub1 ins6 = (Sub1) ins5;
		}
		else {
			System.out.println("����ȯ �Ұ�");
		}
	
		
		Super1 obj1 = new Sub1();
		if (obj1 instanceof Sub1) {
			Sub1 obj2 = (Sub1) obj1;
			obj2.prt();
			obj2.draw();
			obj2.view();
		}
		else {
			System.out.println("����ȯ �Ұ�2");
		}
		
		
		
	}

}