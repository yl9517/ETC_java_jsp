package msa07;
/*
 *  static 추가설명
 *  
 *  [클래스 메서드] (정적메서드,static 메서드)  :  메서드 이름 앞에 static을 붙임
 *  사용방법 : 클래스이름.메소드();
 *  
 *   	Static void prt(){
 *   		
 *   	}
 *  
 *   
 *   클래스 메소드에 사용할 수 있는 변수 : 지역변수(매개변수 포함), 클래스변수 
 *   		but 인스턴스 변수 사용 안됨!!!!!!!
 *   
 */
class Static2{
	
	static String addr="seoul";  //클래스 변수 (필드)  //클래스가 읽어질때 메모리 할당
	int age; //인스턴스 변수 (필드,멤버변수)	//객체를 만들었을 때 메모리 할당. (static이 아니므로 바로 호출할수 없음)
	
	
	public static void prt(int su) { //클래스 메소드(매개변수) 		//매개변수->지역변수이기도 함
		
		String name = "hong"; //지역변수 	 //메소드가 호출될때 지역변수 메소드 할당 됨
		System.out.println("prt!!");
		System.out.println(addr);	//할당 된 변수이므로 사용 가능
		//System.out.println(age); //에러(메모리 할당이 안된 변수이므로)
	}
	
}

public class StaticTest2 {

	public static void main(String[] args) {
		Static2.prt(10); //객체 만들지 않고 클래스의 메소드 바로 호출
		
		Static2 a2 = new Static2(); //이때 static2라는 클래스의 인스턴스 변수 메모리 할당됨
		String gi = a2.addr;
		
	}

}
