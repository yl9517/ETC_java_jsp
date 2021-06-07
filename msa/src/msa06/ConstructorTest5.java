package msa06;

class Person5{
	
	//필드   //(객체 관점) 인스턴스 변수  //(Person관점) 멤버변수
	String name;
	int age;
	String addr;
	String phone;
	
	//생성자	
	Person5(String name, int age,String addr,String phone){
		
		this(name,age,addr);  //생성자 this    //생성자 호출 - 매개변수 3개짜리의 자기 생성자로 이동  (반드시 첫째줄에서 호출)
		this.phone=phone;     //참조변수 this
		System.out.println("생성자4");
	}
	Person5(String name, int age,String addr){	
		this(name,age); 
		this.addr=addr;
		System.out.println(addr);
	}
	Person5(String name, int age){	
		this(name); 
		this.age = age;
		System.out.println("생성자2");
	}
	Person5(String name){
		this.name=name;
		System.out.println("생성자2");
	}
	
	//멤버 변수 출력하는 메소드
	void print(){
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("addr : "+addr);
		System.out.println("phone : "+phone);
		
	}
	
	
}
public class ConstructorTest5{

	public static void main(String[] args) {
		
		Person5 p1 = new Person5("홍길동",10,"서울","01023"); 

		p1.print();
		
	}
}
