package msa06;
/*
 * ĸ��ȭ (private)   >>   priavte �ʵ�� Ÿ Ŭ�������� ���� ����!!!
			������,�޼ҵ带 ���� ���س��� �԰ݿ� ���߿� ���� ���� �� ����
 * 
 */
class Access1{
	
	private int su;
	
	//������
	Access1(){
		
	} 
	
	Access1(int su){
		if(su<0)
			su=0;
		this.su=su;
	}
	
	//�޼ҵ�
	void prt() {
		System.out.println("Su : "+su);
	}
}
public class Access {
	public static void main(String[] args) {
		Access1 ins = new Access1();
//		ins.su = -100;    >>   priavte �ʵ�� ���� ����!!!
//		System.out.println(ins.su);

		//����x, ������,�޼ҵ带 ���� ���س��� �԰ݿ� ���߿� ���� ���� �� ����
		Access1 ins2 = new Access1(20);
		ins2.prt();
		
	}
}