package msa07;
class Man1{
	//public void prt() {}
	//�Ʒ��� ���� �޼ҵ�� ����
	
	public String prt() {
		return "hong";
	}
	
}

public class MethodTest {

	public static void main(String[] args) {
		Method ins1 = new Method();
		ins1.modify("hong", 20);
		ins1.print();
		
		
		Method ins2 = new Method();
		ins2.modify("kim", "����");
		ins2.print();
		
		
		Man1 ins = new Man1();
		String name = ins.prt();
		System.out.println(name);
		System.out.println("------");
		ins.prt(); //prt�� return���� �شٰ� ������ �ȹ�����
		
	}

}
