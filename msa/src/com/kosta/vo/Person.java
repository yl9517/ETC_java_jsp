package com.kosta.vo;
/*
 *  패키지 : 클래스를 묶어놓은 폴더
 * 
 * 
 */
public class Person {
	//필드
	private String name;
	private int age;
	
	//생성자
	public Person() {
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//메소드
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
	
	
}
