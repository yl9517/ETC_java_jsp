package msa08;

class Parent1{
	public void prt() {
		System.out.println("Parent-prt method");
	}
}

class Child1 extends Parent1{
	public void draw() {
		System.out.println("Child-draw method");
	}
	
	@Override  //������̼�
	public void prt() { //�޼ҵ� �������̵� : ������
		System.out.println("Child-prt ������");
	}
	
}
public class OverrideTest {

	public static void main(String[] args) {
		
		Parent1 ins = new Parent1();
		ins.prt();   //Parent-prt method
		
		Child1 ins2 = new Child1();
		ins2.draw();   //Child-draw method
		ins2.prt();    //Child-prt ������

	}

}
