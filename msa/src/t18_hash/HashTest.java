package t18_hash;


class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
public class HashTest {

	public static void main(String[] args) {
		String name="hong";
		String name2="park";
		
		System.out.println(name.hashCode());
		System.out.println(name2.hashCode());

		Person p1 = new Person("park", 20);
		Person p2 = new Person("park", 20);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
	}

}
