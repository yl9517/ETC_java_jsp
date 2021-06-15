package msa12;

class Person1{
	private String name;
	private int age;
	
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
public class RefTest1 {

	public static void main(String[] args) {
		Person1 p1 = new Person1("hong", 20);
		Person1 p2 = p1; //같은 메모리 가르키고 있음
		
		
		p2.setName("park"); //p1의 name까지 바뀜
		System.out.println(p1);
		System.out.println(p2);
	}

}
