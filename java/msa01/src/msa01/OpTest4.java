package msa01;

/*
 *  logical operator : ������
 *  && (and - ��� T�϶��� T)&
 *  || (or - �ϳ��� T�̸� T)|
 *  ! (not - T�̸� F, F�̸� T)~
 *  ^ (XOR - �������̸� F, �ٸ����̸� T)^
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
