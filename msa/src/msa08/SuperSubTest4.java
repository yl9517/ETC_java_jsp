package msa08;

// super(); = �θ�Ŭ������ ������ ȣ��

class Super4{
	//������
	public Super4() {
		System.out.println("Super4 Constructor");
	}
	
}

class Sub4 extends Super4{ //�������� �θ�Ŭ������ ��ӹ��� �� X
	
	public Sub4() {
		super(); //�θ�Ŭ������ ������ ȣ�� (Super4())
		System.out.println("Sub4 Constructor");
	}
	
	
}

public class SuperSubTest4 {

	public static void main(String[] args) {
		Super4 ins = new Super4(); //Ŭ������ ������ �̿��Ͽ� �ν��Ͻ�ȭ
		Sub4 ins2 = new Sub4();
		
		
		
	}

}