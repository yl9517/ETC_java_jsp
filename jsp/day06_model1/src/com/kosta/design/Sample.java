package com.kosta.design;

class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
}
public class Sample {

	public static void main(String[] args) {
		Person p1 = new Person("hong", 20);
		Person p2 = new Person("hong", 20);
		
		System.out.println(p1==p2);
	}

}
