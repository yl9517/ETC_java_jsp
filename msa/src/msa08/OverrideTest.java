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
		
	}
	
}
public class OverrideTest {

	public static void main(String[] args) {
		
		

	}

}
