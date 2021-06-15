package msa11;

public class A {
/*
 *  member -> account(p283 19번)  -> ab(추상) -> fly(인터페이스) -> t.11 + able -> t.11_2
 *  
 *  
 *  * [추상클래스] msa10
 * 
 * 	* [인터페이스] : 기능 (안경과 렌즈를 비교하면 시력교정이라는 기능만 같고, 그 외는 전혀 관련이 X)
 * 			- 여러개의 부모 클래스 상속 가능 (상속받을 시 implements 사용)
 * 			- 인터페이스 안의 변수는 모두 public static final 변수
 * 			- 인터페이스 안의 메소드는 모두 public abstract 메소드 (전체공개 추상메소드) 
 *			- 객체를 만들지 못하기 때문에 생성자 없음
 *			- 자바 8버전 이후로 디폴트 메소드, 클래스(static) 메소드 사용 가능
 *
 *
 *		
 *	추상 클래스(abstract class)				인터페이스(interface)
 *							공통점 : 객체 생성 못함
 *
 *								차이점
 * 	  extends로 상속							implements로 상속
 * 	    단일상속								여러개상속 가능
 *    일반메소드 + 추상메소드 + static메소드		public abstract 메소드 + static 메소드 + default메소드
 *    생성자 O								생성자 X
 *    모든 변수 사용가능 							public static final 변수만 쓸 수 있음
 * 
 * 
 * 	
 * 
 * [객체생성]
 * 	String name="hong";  ▶   String name = new String("hong"); 과 같음
 * 
 * 	Person p1= new Person();
 * 	p1.prt(new A(),20);
 * 
 * 
 */
}
