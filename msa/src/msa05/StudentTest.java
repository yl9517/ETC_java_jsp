package msa05;

class Student{
	String name="aaa";
	
	String walk() {
		System.out.println("°É¾î°©´Ï´Ù");
		return "hong gil dong";
	}
	
}
public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student();
		System.err.println(s.name);
		
		String data = s.walk();
		System.out.println(data);

	}

}
