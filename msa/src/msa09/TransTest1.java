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
		
		Tr1 in3 = new SubTr1();  //in3�� ����Ű�� �ִ� Ÿ���� Tr1(Tr1�� prt�� view�� ������ ����) --> Ȯ�� �� SubTr1�� ��ü�� �������(sub�� draw�� view�� ����)
								//tr1�� ����ų �� �ִ� ���� prt�� view�̹Ƿ� draw�� ���� ���� view�� Subtr1�� ������ �ִ� view ����
		in3.prt();
		in3.view();
		//in3.draw();  //����    
		//SubTr1 in4 = (SubTr1) new Tr1(); //����X
		
		
	}

}