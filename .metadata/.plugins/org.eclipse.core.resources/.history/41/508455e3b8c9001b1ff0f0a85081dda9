package msa09;


class Tr1{
	
	public void prt() {
		System.out.println("Tr1...prt method");
	}
	public void view() {
		System.out.println("Tr1...view method");
	}
}

class SubTr1 extends Tr1{
	
	public void draw() {
		System.out.println("SubTr1...draw");
	}
	@Override
	public void view() {
		super.view();
		System.out.println("SubTr1...view");
	}
	
}


public class TransTest1 {

	public static void main(String[] args) {

		Tr1 ins = new Tr1();
		ins.prt();
		ins.view();
		
		SubTr1 ins2 = new SubTr1();
		ins2.draw();
		ins2.view();
		ins2.prt();
		
		Tr1 in3 = new SubTr1();  //in3이 가리키고 있는 타입은 Tr1(Tr1은 prt와 view를 가지고 있음) --> 확장 된 SubTr1로 객체가 만들어짐(sub은 draw와 view를 가짐)
								//tr1이 가리킬 수 있는 것은 prt와 view이므로 draw는 접근 못함 view는 Subtr1이 가지고 있는 view 접근
		in3.prt();
		in3.view();
		//in3.draw();  //에러    
		//SubTr1 in4 = (SubTr1) new Tr1(); //실행X
		
		
	}

}
