package msa10;

class Parent{
	public String nation;
	
	public Parent() {
		this("´ëÇÑ¹Î±¹");
		System.out.println("parent()");
	}
	public Parent(String nation) {
		this.nation =nation;
		System.out.println("parent(String nation)");
	}
}

class Child extends Parent{
	private String name;
	
	public Child() {
		//super();
		this("È«±æµ¿");
		System.out.println("Child()");
	}
	public Child(String name) {
		this.name=name;
		System.out.println("Child(String name)");
	}

}

public class P339_6 {

	public static void main(String[] args) {
		Child child = new Child();
	}

}
