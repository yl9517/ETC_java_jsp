package msa18;

class Student{ //outer class
	public String dept; //멤버변수
	public String hakno;
	
	class boy{ //inner class //멤버 클래스
		public String name;
		public int age;
	}


}

public class NextTest {

	public static void main(String[] args) {

		//student 클래스
		Student s = new Student();
		s.dept="a1";
		System.out.println(s.dept);
		
		//student 클래스안의 boy 클래스 
		Student.boy ins = s.new boy();
		
	}

}
