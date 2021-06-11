package msa10;

public class A {
/*
 *  super,sub - t10.acc(접근지정자) -> abstract(추상클래스) -> super2,sub2  -> t10 sample(상속관계 실험)
 *  
 *  
 *  
 * 
 * 	* [형변환 체크] instanceof
 * 
 * 	* [접근지정자]
 * 	   	private : 클래스 내에서만 접근
 * 		default :
 * 		protected :
 * 		public : 전체 공개
 * 
 * 
 * 	* [추상] abstract 
 * 		┗ 추상 클래스 | 사용법 : abstract class 클래스명{   }
 * 			객체생성을 하지 못하는 클래스 (오로지 상속을 위한 클래스)
 * 			-객체 생성 하려면 : 일반클래스에서 상속받아 만들기
 * 
 * 		┗ 추상 메소드 | 사용법 : public abstract void 메소드명();   ▶ 다형성 구현
 * 			반드시 추상 클래스 내에서만 사용 가능
 * 			선언만 하는 것
 * 			상속받는 자식클래스에서 반드시 오버라이딩 해주어야함
 * 
 * 	
 * 	   [다형성] : 같은 타입이지만 실행 결과가 다양한 객체를 이용할 수 있는 성질
 * 
 * 
 * 	
 * 	[객체지향 프로그램 특징]
 * 	-캡슐화  -> 정보은닉 private
 *  -상속
 *  -다형성
 *  
 *  
 *  * [상속/포함]  언제 쓸지 구분!!
 *  is A : 상속관계        >>  사과나무는 나무이다 (상하관계가 있음, 카테고리)
 *  
 *  	abstract class 강아지{								class 시츄 extends 강아지{
 *  
 *  	}													}
 *  
 *  
 *  Has A : 포함관계	>>	나무는 사과나무를 가지고 있다(x) / 자동차는 바퀴와 핸들을 가지고 있다(o) (구성요소)
 *  
 *  	class Student{										class Score{
 *  		private String name;								int kor;
 *  		private String age;									int eng;
 *  		private Score s;								}
 * 		}													
 *  
 * 
 * 
 */
}
