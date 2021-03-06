package msa06;
/*
 *  Constructor            *  객체를 만들기 위해서는 반드시 생성자가 필요
 *  
 *  [생성자] 객체를 만드는 자  (바로 초기화 시켜주기 위해서 만듦)
 *     ┗ 클래스 이름과 같은 이름!! 리턴타입 없음!! 
 *     
 *    호출시점 : new 할때 자동으로 호출
 *    사용이유 : 객체의 인스턴스 변수들을 초기화 하기위해 객체가 만들어지면서 해야할 기술
 *    
 */

class Student{
	//필드
	String name;
	// 객체를 만들기 위해서는 반드시 생성자가 필요
	//생성자가 아예 없을 시 빈 생성자가 기본으로 생김!!! (빈 생성자 필수)
	
	//생성자
	Student(String n){
		name=n;
	}
}
public class ConstructorTest{

	public static void main(String[] args) {
		Student s1 = new Student("hong gil dong");
		System.out.println(s1.name);
		
		//Student s2 = new Student();   //해당하는 생성자가 없어서 에러
	}
}
