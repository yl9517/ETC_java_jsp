package msa07;

class Person2{
	
//	void prt(String name) {
//		System.out.println(name);
//	}
//	void prt(String name,String addr) {
//		System.out.println(name);
//		System.out.println(addr);
//	}
//	void prt(String name,String addr,String postCode) {
//		System.out.println(name);
//		System.out.println(addr);
//		System.out.println(postCode);	
//	}
	
	//�Ű������� ����� �𸦶� "...�����̸�"  ��   �迭�� �ν�
	void prt(String ...items) { //item �迭

		for(String item:items) {
			System.out.print(item);
		}
		System.out.println();

	}
	void prt(int su,String ...items) { //�̷��͵� ���� 

	}
	
	
}

public class Argu {
	public static void main(String[] args) {
		Person2 ins = new Person2();
		
		ins.prt("Hong");
		ins.prt("Hong","Seoul");
		ins.prt("Hong","Seoul","1111");
		ins.prt("Hong","Seoul","1111","eeeeeee");
		
	
	}
}