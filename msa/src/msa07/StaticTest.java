package msa07;
/*
 * [static] - 클래스 로딩 시(읽어질 때) 메소드 영역에 메모리 할당
 * 
 * 클래스 변수, 정적변수, static 변수
 *  선언 : static 타입 변수;
 *  사용 : 클래스이름.변수
 *  	
 */
class Static1{
	static int su=10; //클래스 변수,정적변수, static 변수
}

public class StaticTest {

	public static void main(String[] args) {

		Static1 ins = new Static1();
		Static1 ins2 = new Static1();
		Static1 ins3 = new Static1();

		ins.su=10;
		ins2.su=100;
		ins3.su=1000;
		
		System.out.println(ins.su);  //1000
		System.out.println(ins2.su);  //1000
		System.out.println(ins3.su);  //1000
		System.out.println(Static1.su);  //1000  //static은 보통 이렇게 선언함. 이 순간에 메모리할당
	}

}
