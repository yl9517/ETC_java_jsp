package t11;

interface A{
	void prt(); //public abstract �޼ҵ�
	default void view() {
		System.out.println("A Interface view method");
	}
}

class Aimple implements A{
	@Override
	public void prt() {
		System.out.println("Aimple class-prt method");
	}
	public void draw() {
		System.out.println("Aimple class-draw method");
	}
}

public class InterTest2 {

	public static void main(String[] args) {
//		A ins = new A(); //�������̽��� ��ü ������
		
		Aimple ins2 = new Aimple();
		ins2.view();
		ins2.prt();
		ins2.draw();
		
		A ins3 = new Aimple();
		ins3.view();
		ins3.prt();
		
	}

}
