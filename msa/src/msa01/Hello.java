package msa01;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello world!!");
		
		System.out.print("안녕하세요");
		System.out.print("홍길동님");
		System.out.println("만나서 반갑습니다");
		System.out.println("end");
		
		// \n :새로운 줄   \f : tap만큼 띄어쓰기
		System.out.printf("이름 : %s \t 나이 : %d \t 점수:%.1f\n","이여름",24,95.55);
		
		System.out.println("eee");
		
		
		//변수 : 변하는 수     값을 담는 그릇
		/*
		 *  정수 : int
		 *  실수 : float
		 *  문자 : char
		 *  문자열 : string
		 * 
		 */
		System.out.println("----");
		
		
		int su;
		su=20;
		System.out.println(su);
		
		int su2=30; //변수 초기화 initalize
		System.out.println(su2);
		
		int a=20, b=30, c=100; // int a=20; int b=30; int c=100;과 같음
		int d,e=40; //d는 초기화 안되어있음
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
