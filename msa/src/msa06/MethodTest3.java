package msa06;
/*
 * 값 비교 : ==
 * 객체 비교 : equals
 * 
 */
class Person{
	
	void t1() {
		System.out.println("t1");
	}
	void t2() {
		System.out.println("t2");
		
	}
	void t3() {
		//t1,t2 동작
		t1();
		t2();
	}
}
public class MethodTest3{

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.t1();
		p1.t2();
		p1.t3();
		
		Person p2 = new Person();
	
	}
}
