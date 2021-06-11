package msa10;

public class SuperSubTest1 {

	public static void main(String[] args) {

		Super1 ins = new Sub1(); //up Casting
		ins.prt();
		ins.view();
		 
//		Sub1 ins2 = (Sub1) new Super1(); //ClassCastException 클래스 변환 오류
		
		Super1 ins3 = new Sub1();
		//super을 가르킬수 있는 ins3 / sub에서 메모리 할당
		Sub1 ins4 = (Sub1) ins3;
		
		ins4.draw();
		ins4.prt();
		ins4.view();
		

		//빨간줄 에러가 뜨지 않으므로 바로 형변환 하지말고
		//형변환 가능한지 체크 (instanceof)
		Super1 ins5 = new Super1();
		
		if (ins5 instanceof Sub1) {  //super1형태의 ins5가 sub1형태로 바꿀 수 있니?
			Sub1 ins6 = (Sub1) ins5;
		}
		else {
			System.out.println("형변환 불가");
		}
	
		
		Super1 obj1 = new Sub1();
		if (obj1 instanceof Sub1) {
			Sub1 obj2 = (Sub1) obj1;
			obj2.prt();
			obj2.draw();
			obj2.view();
		}
		else {
			System.out.println("형변환 불가2");
		}
		
		
		
	}

}
