package msa05;
/*
 *  열거형 (enum) : 몇개의 값으로만 한정적으로 이루어져 가지고 있는 타입
 */

enum Week{
	sun,mon,tue,wed,thu,fri,sat
}

public class EnumTest {

	public static void main(String[] args) {
		
		System.out.println(Week.sun);
		System.out.println(Week.fri);
			
		Week w = Week.wed;
		
		System.out.println(w);
	}

}
