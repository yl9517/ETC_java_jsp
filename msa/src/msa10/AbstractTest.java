package msa10;
/*
 * 
 */
abstract class Dog{
	public void sound() {
		System.out.println("�۸�");
	}
	public void eat() {
		System.out.println("���� �Խ��ϴ�.");
	}
	public abstract void act(); //�߻�޼ҵ� - �� ��� ��� �޴� �ڽĿ��� ����� �������־����
		
	
}


class GoldenRetriever extends Dog{
	
	@Override
	public void act() {
		System.out.println("���� �μ���");
		System.out.println("���ĸ� ��´�");
	}
	
}
class ShihTzu extends Dog{
	@Override
	public void act() {
		System.out.println("������ �̴´�");
		System.out.println("�ڸ� ���");
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		
//		Dog ins = new Dog(); //�߻�Ŭ���� dog�� ��ü ���������Ƿ� ����
//		GoldenRetriever ins3 = new Dog(); //�߻�Ŭ���� dog�� ��ü ���������Ƿ� ����
		
		GoldenRetriever ins = new GoldenRetriever();
		
		Dog ins2 = new GoldenRetriever();		
		ins2.sound();
		ins2.eat();
		ins2.act();
		
		ins2 = new ShihTzu(); //������ ����
		ins2.act();
	}

}