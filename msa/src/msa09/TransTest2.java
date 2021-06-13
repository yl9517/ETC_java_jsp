package msa09;


class Trans2{
	
	public void prt() {
		System.out.println("Trans2-prt method");
	}
	public void view() {
		System.out.println("Trans2-view method");
	}
}

class SubTrans2 extends Trans2{
	
	@Override
	public void view() {
		//super.view();
		System.out.println("SubTrans2-view");
	}

	public void print() {
		super.view(); //부모의 view를 호출 할 경우 super를 써야함
		view();	//this.view(); 라는 뜻
	}
}


public class TransTest2 {

	public static void main(String[] args) {
		
		Trans2 ins = new SubTrans2();
//		ins.prt();
//		ins.view();

		SubTrans2 ins2 = new SubTrans2();
//		ins2.prt();
//		ins2.view();
		ins2.print();
	}

}
