package msa05;
/*
 * 
    Ŭ���� : ���� ������ ���ܿ� ���ϴ� �Ӽ��� ������ ����
    ��ü : Ŭ������ �ν��Ͻ�ȭ(��üȭ) �� �� (Ŭ������ �޸𸮸� �����ϸ� ��ü ����)
    
    �޼ҵ�(int �Ű�����)
    void = ������ �� ����
    
    intŸ�Ե� �����Ϸ��� �ּҸ� �����ϴµ� intŸ���� �ּҰ��� ����ϴ� ����� �ִ���? ����. �ڹ���ü���� ������ ����
 * 
 */
class Person2{
	
	void prt(){
		System.out.println("prt method call");
	}
	void draw(String data) { //date = �Ű����� ����(Argument)
		System.out.println(data+"�� �׸��ϴ�");
	}
	void cal(int a,float b,long c,char d,String e) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	void think(int su, int su2) {
		System.out.println("su1 : "+ su +", "+su2);
	}
	
}


public class MethodTest {

	public static void main(String[] args) {
		Person2 ins = new Person2();
		//ins �� �ν��Ͻ�(��ü�� ��üȭ)  //new Person2();�� ��ü
		ins.prt();
		ins.draw("������");
		ins.cal(10, 20.2f, 30L, 'a', "hong");

		int data1 = 10;
		int data2 = 20;
		ins.think(data1, data2);
		
		
	}

}