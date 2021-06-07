package msa06;
/*
 * 캡슐화 (private)
 * 
 */
public class Access2Test {
	public static void main(String[] args) {
		Access2 ins = new Access2("홍길동");
		//ins.name="hong"; //name이 private라서 객체의 name 인식 안됨
		System.out.println(ins.getName()); //값 출력
		
		ins.setName("park");  //값 변경
		System.out.println(ins.getName()); //값 출력
		
	}
}
