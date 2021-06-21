package sort;


//test3��
public class StudentDTO implements Comparable<StudentDTO>{
	private String hakno;
	private String name;
	private int age;
	
	public StudentDTO(String hakno, String name, int age) {
		super();
		this.hakno = hakno;
		this.name = name;
		this.age = age;
	}

	public String getHakno() {
		return hakno;
	}

	public void setHakno(String hakno) {
		this.hakno = hakno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentDTO [hakno=" + hakno + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(StudentDTO o) {
		// �տ� �� ũ�� ��� / ������ 0 / �ڿ��� ũ�� ����
		
		//���� ����
		return age-o.age;
		
		//�̸� : return -(name.compareTo(o.name));
	}

	
}
