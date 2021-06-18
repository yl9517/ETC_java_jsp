package msa15;

import java.util.Stack;

public class StackTest1 {

	public static void main(String[] args) {

		Stack<String> s = new Stack<String>();
		
		s.push("hello1");
		s.push("hello2");
		s.push("hello3");

		String dta = s.peek();
		System.out.println(s.pop()); //값을 꺼내서 출력
		System.out.println(dta); //보이는 값 출력 (삭제X)
		System.out.println(s.peek());
		System.out.println(s.peek());
		
	}

}
