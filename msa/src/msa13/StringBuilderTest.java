package msa13;

public class StringBuilderTest {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("abc");
		
		//append : 추가
		sb.append("hong gil dong");
		sb.append("hello",1,2); //1번째~2-1번째까지 인덱스 추가
		System.out.println(sb);
				System.out.println("---------");

		StringBuilder sb2 = new StringBuilder("abc");
		System.out.println(sb2.capacity()); //용량
		System.out.println(sb2.length());	//길이
		
		sb2.append("12345678901234567"); //17개추가
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());	
		
		
		//delete : 삭제		
		sb2.delete(2, 5); //2번째부터 5-1번째까지의 문자 삭제
		System.out.println(sb2);
	
		
		//insert : 원하는 위치에 삽입(추가)
		sb2.insert(2, "hello"); //2번째 인덱스에 hello 삽입
		System.out.println(sb2);
		
		//reverse : 거꾸로
		System.out.println(sb2.reverse());
		
		//trimToSize : length만큼으로 용량(공백) 줄이기
		System.out.println(sb2.capacity());
		sb2.trimToSize();
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		
	}
}
