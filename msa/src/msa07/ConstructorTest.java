package msa07;

public class ConstructorTest {
	public static void main(String[] args) {
		Constructor p1 = new Constructor();
		
		//p1.name="hong";   //name이 private라서 접근x -> 에러
		p1.setName("hong");  //변경메소드로 값 저장
		System.out.println(p1.getName());  //호출메소드 호출
		
	}
}
