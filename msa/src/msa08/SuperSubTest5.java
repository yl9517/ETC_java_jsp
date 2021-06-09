package msa08;

// super(); = 부모클래스의 생성자 호출

class Super5{
	//필드
	private String name;
	//생성자
	public Super5(String name) {
		this.name=name;
		System.out.println(name);
	}
	
}

class Sub5 extends Super5{ //여러개의 부모클래스를 상속받을 수 X
	
	private int age;
	public Sub5(String name,int age) {
		super(name); //부모생성자 호출
		this.age=age;
		System.out.println(name+age);
	}
	
	
}

public class SuperSubTest5 {

	public static void main(String[] args) {
		Super5 ins = new Super5("kim"); //클래스의 생성자 이용하여 인스턴스화
		Sub5 ins2 = new Sub5("lee",10);
		
		
		
	}

}
