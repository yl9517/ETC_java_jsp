package msa08;

// super(); = 부모클래스의 생성자 호출

class Super3{
	//생성자
	public Super3(){
		System.out.println("super3 constructor");
	}
}

class Sub3 extends Super3{
	public Sub3(){
		//super(); 도 있는 것
		System.out.println("sub3 sconstructor");
	}
}

public class SuperSubTest3 {

	public static void main(String[] args) {
		Super3 ins= new Super3();
		System.out.println("----");

		Sub3 ins2 = new Sub3(); //부모생성자 까지 호출 됨
	}

}
