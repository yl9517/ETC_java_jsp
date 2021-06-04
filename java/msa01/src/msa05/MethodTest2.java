package msa05;
/*
 * 1. 메인에서 입력받아 B class의 prt 메서드에서 출력
 * 2. 메인에서 나이 입력받아 calAge()를 만들어 10~60대를 메인에서 출력
 * 
 */
import java.util.Scanner;

class B{
	
	void prt(String irum) {
		System.out.println("이름은 "+irum);
	}
	
	String calAge(int age) {
		String thisAge="";
		
		if(age>=60)
			thisAge = "60대 이상";
		else if(age>=50)
			thisAge = "50대";
		else if(age>=40)
			thisAge = "40대";
		else if(age>=30)
			thisAge = "30대";
		else if(age>=20)
			thisAge = "20대";
		else if(age>=10)
			thisAge = "10대";
		else
			thisAge = "10대 이하";
			
		return thisAge;
	}
	
}


public class MethodTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		B ins = new B();
		//ins 가 인스턴스(객체를 실체화)  //new B();가 객체
		
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		ins.prt(name);
		
		
		// 2. 메인에서 나이 입력받아 calAge()를 만들어 10~60대를 메인에서 출력
		System.out.print("나이 입력 : ");
		int agee = sc.nextInt();
		
		String firAge = ins.calAge(agee);
		System.out.println("당신은 "+firAge+" 입니다");
		
	
	}

}
