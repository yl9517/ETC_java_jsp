package msa10;

public class Sub2 extends Super2 {
	
	//@Override
	//super부모클래스에서 private로 선언 한 것을 클래스 외부에서 모름
	//그렇기 때문에 재정의 한 것이 아닌 새로 정의 한 것
	void prt() {
		System.out.println("sub2-prt method");
	}
}
