package msa12;

class Sample2{ //extend Object
	private String name;
	private int age;
	
	public Sample2(String name,int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Sample2 [name=" + name + ", age=" + age + "]";
	}
	
}

public class ObjectTest2 {

	public static void main(String[] args) {

		Sample2 ins = new Sample2("hong", 20);
		System.out.println(ins.toString());
		System.out.println(ins); //object의 toString 자동호출

	}

}
