package msa06;

class Person4{
	
	//필드
	String name;
	int age;
	String addr;
	String phone;
	
	//생성자	
	Person4(String name, int age,String addr,String phone){
		
		this(name,age,addr);  //생성자 호출!! - 매개변수 3개짜리의 자기 생성자로 이동
		//this.phone=phone;
		System.out.println("생성자4");
	}
	Person4(String name, int age,String addr){	
//		this.name = name; 
//		this.age = age;
//		this.addr=addr;
		System.out.println("생성자3");
	}
	Person4(String name, int age){	
		this.name = name;
		this.age = age;
		System.out.println("생성자2");
	}
	
}
public class ConstructorTest4{

	public static void main(String[] args) {
		
		Person4 p1 = new Person4("홍길동",10,"서울","01023"); 
		//[출력]
		//생성자3
		//생성자4
		
	}
}
