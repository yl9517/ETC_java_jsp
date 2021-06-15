package msa12;

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

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}


//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return 1;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		boolean result=false;
//		if(obj instanceof Person) {  //형변환 체크
//			Person p = (Person) obj;
//			if(this.name.equals(p.name) && age==p.age)
//				result = true;
//			else
//				result = false;
//		}
//
//		return result;
//	}
	
	
	// source -> hashcode and equals
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
}

public class ObjectEquTest1 {

	public static void main(String[] args) {
		Person p1 = new Person("hong", 10);
		Person p2 = new Person("hong", 20);

		System.out.println(p1.equals(p2)); // 객체가 가르키는 메모리 비교 false  ▶   툴로 equals와 hashCode 모두 재정의
		System.out.println(p1.getName().equals(p2.getName())); //내용비교
		
	}

}
