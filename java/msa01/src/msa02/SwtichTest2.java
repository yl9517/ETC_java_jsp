package msa02;
/*  switch문   
 * 	switch문의 경우에는 비교연산 등 사용X
 * 
 * */
public class SwtichTest2 {

	public static void main(String[] args) {
		
		char ch='f';
		
		switch(ch) {
		case 'a' :
			System.out.println("문자 a입니다");
			break;
		case 'b' :
			System.out.println("문자 b입니다");
			break;
		case 'c' :
			System.out.println("문자 c입니다");
			break;
		default :
			System.out.println("나머지 문자");
		
		}

	}

}
