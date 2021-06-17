package msa14;

import java.util.Scanner;
import java.util.StringTokenizer;

//String Tokenizer

public class StringTok {

	public static void main(String[] args) {

		StringTokenizer stk = new StringTokenizer("hong gil dong"); //알아서  공백 기준으로 분리
		
		System.out.println(stk.countTokens()); //음절 수 (공백 기준)
		
		//다음 음절을 출력함 = nextToken,nextElement
		System.out.println(stk.nextToken()); //nextToken ▶ return String타입
		System.out.println(stk.nextToken()); //nextElement ▶ return Object타입 (String 에 넣으려면 강제형변환 해야함)
		System.out.println(stk.nextToken());
		
		//반복문 = hasMoreTokens , hasMoreElements  ▶ return boolean타입
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
		
		
		
		StringTokenizer stk2 = new StringTokenizer("hong,kim;lee,park",","); //,를 기준으로 자르겠어
		while(stk2.hasMoreElements()) {
			String data = (String)stk2.nextElement();
			System.out.println(data);
		}
		
		
		StringTokenizer stk3 = new StringTokenizer("hong,kim;lee,park",",;"); //, 또는 ; 를 기준으로 자르겠어
		while(stk3.hasMoreElements()) {
			String data = (String)stk3.nextElement();
			System.out.println(data);
		}
		
		System.out.println("----------");
		
		StringTokenizer stk4 = new StringTokenizer("hong,kim;lee,park",",;",true); //, 또는 ; 를 기준으로 자르는데 기준까지 출력
		while(stk4.hasMoreElements()) {
			String data = (String)stk4.nextElement();
			System.out.println(data);
		}
		
		System.out.println();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("email : ");
		String email = sc.next();
		
		StringTokenizer stk5 = new StringTokenizer(email,"@");
		System.out.println("이메일:"+stk5.nextToken());
		System.out.println("이메일:"+stk5.nextToken());
		
		
		
	}

}
