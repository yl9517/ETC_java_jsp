package msa18;

class Student{ //outer class
	public String dept; //�������
	public String hakno;
	
	class boy{ //inner class //��� Ŭ����
		public String name;
		public int age;
	}


}

public class NextTest {

	public static void main(String[] args) {

		//student Ŭ����
		Student s = new Student();
		s.dept="a1";
		System.out.println(s.dept);
		
		//student Ŭ�������� boy Ŭ���� 
		Student.boy ins = s.new boy();
		
	}

}
