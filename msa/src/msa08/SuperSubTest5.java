package msa08;

// super(); = �θ�Ŭ������ ������ ȣ��

class Super5{
	//�ʵ�
	private String name;
	//������
	public Super5(String name) {
		this.name=name;
		System.out.println(name);
	}
	
}

class Sub5 extends Super5{ //�������� �θ�Ŭ������ ��ӹ��� �� X
	
	private int age;
	public Sub5(String name,int age) {
		super(name); //�θ������ ȣ��
		this.age=age;
		System.out.println(name+age);
	}
	
	
}

public class SuperSubTest5 {

	public static void main(String[] args) {
		Super5 ins = new Super5("kim"); //Ŭ������ ������ �̿��Ͽ� �ν��Ͻ�ȭ
		Sub5 ins2 = new Sub5("lee",10);
		
		
		
	}

}
