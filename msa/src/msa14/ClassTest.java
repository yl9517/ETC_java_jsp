package msa14;

class Person{
	public void prt() {
		System.out.println("Person class prt method!!");
	}
}
public class ClassTest {

	public static void main(String[] args) {
		try {
			Class c = Class.forName("msa14.Person"); // forName = �ش� ��Ű��.Ŭ������ ���� ��ü�� �о��
			Person p = (Person) c.newInstance(); //���÷��� ���
			p.prt();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
