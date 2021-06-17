package msa14;

class Person{
	public void prt() {
		System.out.println("Person class prt method!!");
	}
}
public class ClassTest {

	public static void main(String[] args) {
		try {
			Class c = Class.forName("msa14.Person"); // forName = 해당 패키지.클래스에 대한 객체를 읽어옴
			Person p = (Person) c.newInstance(); //리플렉션 기법
			p.prt();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
