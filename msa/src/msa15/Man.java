package msa15;

public class Man{
	private String name;
	private int age;
	
	public Man(String name,int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}	
}