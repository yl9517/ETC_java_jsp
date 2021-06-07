package msa05;
/*
 *  열거형 (enum) : 몇개의 값으로만 한정적으로 이루어져 가지고 있는 타입
 */

enum Week1{
	sun,mon,tue,wed,thu,fri,sat
}

public class EnumTest2 {

	public static void main(String[] args) {
		Week1 w = Week1.sun;
		
		switch(w) {
		case sun:
			System.out.println("일요일입니다");
			break;

		case mon :
			System.out.println("월요일입니다");
			break;
		default: 
			System.out.println("나머지 요일입니다");
		}
		
	}

}
