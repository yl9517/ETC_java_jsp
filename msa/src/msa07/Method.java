package msa07;
/* 메소드 오버로딩(method overloading)
 *  - 클래스 내에서 이름은 같지만 매개변수의 타입,순서,갯수가 다르면 다른 메소드로 인식
 * 
 * 
 */
public class Method {
	private String name;
	private int age;
	private String addr;
	private String phone;
	
	//name,age 변경 메소드
	public void	modify(String name, int age){
		this.name=name;
		this.age=age;
	}
	//name,addr 변경 메소드
	public void	modify(String name, String addr){ //메소드 오버로딩
		this.name=name;
		this.addr=addr;
	}
	
	public void print() {
		System.out.println(name+" "+age+" "+addr);
	}
	
	
	
	
	
}


