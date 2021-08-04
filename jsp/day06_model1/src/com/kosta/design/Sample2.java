package com.kosta.design;

class Person2{  //싱글톤 패턴
	private static Person2 ins = new Person2();
	
	public static Person2 getInstance() {  //미리 만들어둔 객체, 객체를 가진 이 메소드 하나만 가지고 쓰는 것
		//static 안에 들어가야 할 변수 = 지역변수, 클래스변수! (인스턴스 변수 안됨)
		return ins;
	}
	private Person2() {} //클래스 내에서만 호출
}

public class Sample2 {
	public static void main(String[] args) {
	//	Person2 ins = new Person2();  //private라서 Person2 객체를 직접 가져와서 생성하지 못함!!!!!!
		
		Person2.getInstance();
	}
}
