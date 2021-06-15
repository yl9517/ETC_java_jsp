package msa08;

class Parant2{
	public static void prt() { //static을 사용하면 자동으로 호출되므로 오버라이드 불가
		System.out.println("parent-prt");
	}
}
class Child2 extends Parant2{
	
	public static void prt() { //부모와 관계x
		System.out.println("child-prt");
	}
	
	public static void draw() {
		System.out.println("child-draw");
	}

}

public class OverriedTest3 {

	public static void main(String[] args) {

		Parant2.prt();  //parent-prt
		
		Child2 ins = new Child2();
		ins.prt();  //child-prt
	}

}
