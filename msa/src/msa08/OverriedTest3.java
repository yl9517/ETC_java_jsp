package msa08;

class Parant2{
	public static void prt() { //static�� ����ϸ� �ڵ����� ȣ��ǹǷ� �������̵� �Ұ�
		System.out.println("parent-prt");
	}
}
class Child2 extends Parant2{

	public static void prt() { //�θ�� ����x
		System.out.println("child-prt");
	}

}

public class OverriedTest3 {

	public static void main(String[] args) {

	}

}
