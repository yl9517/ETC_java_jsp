package msa11;
abstract class Dog{
	private String name;
	public static int age;
	
	public Dog() {
		
	}
	
	public static void prt() {  //static ��밡��
		System.out.println("prt");
	}
	
	public void sound() {
		System.out.println("�۸�");
	}
	public void eat() {
		System.out.println("���� �Խ��ϴ�.");
	}
	
	public abstract void act(); //�߻�޼ҵ� - �� ��� ��� �޴� �ڽĿ��� ����� �������־����
		
	
}


class ShihTzu extends Dog{
	@Override
	public void act() {
		System.out.println("������ �̴´�");
		System.out.println("�ڸ� ���");
	}
	
	public void fav() {
		System.out.println("�ڱ�");
	}
}

public class AbTest {

	public static void main(String[] args) {
		
//		Dog ins = new Dog(); //�߻�Ŭ���� dog�� ��ü ���������Ƿ� ����
//		GoldenRetriever ins3 = new Dog(); //�߻�Ŭ���� dog�� ��ü ���������Ƿ� ����

		Dog ins = new ShihTzu();
		ins.act();
		ins.sound();
		Dog.age=23;
		
		System.out.println("==");
		
		ShihTzu ins2 = new ShihTzu();
		ins2.act();
		ins2.sound();
		ins2.fav();
	}
}