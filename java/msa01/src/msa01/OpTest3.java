package msa01;
/*
 *  연결 : 문자+숫자 , 문자+문자   //문자가 우선순위이면 문자열로 인식함 (산술연산하고 싶으면 괄호쓰기)
 *  
 * 
 */
public class OpTest3 {
	
	public static void main(String[] args) {
		
		System.out.println(10+20);  //산술연산
		System.out.println("aa"+"bbb"); //문자열+문자열 => 연결
		
		System.out.println(10+20+"입니다"); // 30입니다
		System.out.println("결과는"+10+20); // 입니다1020 
		System.out.println("결과는"+(10+20)); // 입니다30
		System.out.println(10==10.0f); // true  //형식에 대한 비교X, 오직 값에 대한 비교o
		
	}

}
