package msa05;
/*
 * 1. 메인에서 입력받아 B class의 prt 메서드에서 출력
 * 2. 메인에서 나이 입력받아 calAge()를 만들어 10~60대를 메인에서 출력
 * 
 */
import java.util.Scanner;

class Man{
	
	int age=10;
	
}


public class MethodTest3 {

	public static void main(String[] args) {

		Man ins1 = new Man();
		Man ins2 = new Man();
		
		System.out.println(ins1 ==ins2);
		System.out.println(ins1.age==ins2.age);
		
		Man ins3 =ins1;
		System.out.println(ins3==ins1);
		
	}

}
