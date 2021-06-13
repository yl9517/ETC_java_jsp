package msa09;

public class Super1 {
	
	private String name;
	private int age;
	private String addr;
	
	public Super1(String name,int age) {
		this.name = name;
		this.age =age;
	}
	
	public Super1(String name,int age, String addr) {
		this(name, age);
		this.addr=addr;
	}
	public Super1() {
		
	}

}
