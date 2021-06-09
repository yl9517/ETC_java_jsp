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
	
	@Override  //어노테이션
	public void prt() { //메소드 오버라이딩 : 재정의
		
	}
	
}
public class OverrideTest {

	public static void main(String[] args) {
		
		

	}

}
