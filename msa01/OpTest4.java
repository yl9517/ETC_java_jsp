package msa01;

/*
 *  logical operator : 논리연산
 *  && (and - 모두 T일때만 T)&
 *  || (or - 하나라도 T이면 T)|
 *  ! (not - T이면 F, F이면 T)~
 *  ^ (XOR - 같은값이면 F, 다른값이면 T)^
 * 
 */

public class OpTest4 {

	public static void main(String[] args) {
		
		boolean r1 = 10>=10; //T
		boolean r2 = 100==10; //F
		
		System.out.println(r1 && r2); //F
		System.out.println(r1 || r2); //T
		System.out.println(!r1); //F
		System.out.println(r1^r2); //T
		

	}

}
