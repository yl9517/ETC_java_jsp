package msa08;

class Super1{ //�θ�Ŭ����
	
	public void prt() {
		System.out.println("super1-prt method");
	}
}

class Sub1 extends Super1{ //super1 Ŭ���� ��ӹ��� �ڽ�Ŭ����
	
	public void draw() {
		System.out.println("sub1-draw method");
	}
	
}

public class SuperSubTest {

	public static void main(String[] args) {
		Super1 ins = new Super1();		
		Sub1 ins2 = new Sub1();
		
		ins.prt();
		ins2.prt(); //��ӹ޾����Ƿ� �θ��� �޼ҵ嵵 ��� ����
		ins2.draw();

		Sub1 ins3 = (Sub1) new Super1();
	}

}
