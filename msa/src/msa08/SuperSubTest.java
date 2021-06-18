package msa08;

class Super1{ //부모클래스
	
	public void prt() {
		System.out.println("super1-prt method");
	}
}

class Sub1 extends Super1{ //super1 클래스 상속받은 자식클래스
	
	public void draw() {
		System.out.println("sub1-draw method");
	}
	
}

public class SuperSubTest {

	public static void main(String[] args) {
		Super1 ins = new Super1();		
		Sub1 ins2 = new Sub1();
		
		ins.prt();
		ins2.prt(); //상속받았으므로 부모의 메소드도 사용 가능
		ins2.draw();

		Sub1 ins3 = (Sub1) new Super1();
	}

}
