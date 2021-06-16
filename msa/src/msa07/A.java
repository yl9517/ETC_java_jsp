package msa07;

public class A {
/*
 * constructor -> method -> question -> sort -> filed -> argu 인자 -> static
 *                                      정렬                            매개변수가 몇개인지 모름
 * 
 * 
 *   * [캡슐화] 정보은닉 (private) 외부에서 직접접근 불가
 *		-setter : 해당 메소드를 통해 필드값 변경
 *		-getter : 해당 메소드를 통해 필드값 호출
 * 
 *   * [메소드 오버로딩] method overloading
 *    - 같은 클래스 내에서 이름은 같으나 매개변수의 타입,순서,갯수가 하나라도 다르면 다른 메소드로 인식
 *    - 단,리턴타입과는 무관
 *    
 *    
 *   * [정렬]
 * 
 * 
 *   * [static] - 클래스에 '고정된'멤버로서 객체를 생성하지 않고 사용 할수 있는 필드와 메소드.  
 *   
 *      ┗ [static 변수] (클래스변수) | 사용방법 : 클래스이름.변수
 *   	  	전역,모든 객체에서 공통으로 사용하는 메모리.
 * 		      ★ 클래스가 읽어질 때(로딩 시) method area에 메모리저장됨 (힙x스택x)
 *  		메소드 내에서는 static 변수를 선언X (메소드 내 변수는 지역변수이기 때문)
 *    		 >> 일반적으로 public static final로 선언
 *      
 *      ┗ [static 메소드] (클래스메소드) | 사용방법 : 클래스이름.메소드
 *    		자동으로 final 메소드가 됨 (오버라이딩 불가)
 *    		클래스변수,인스턴스변수,지역변수 선언 가능 (인스턴스변수X)
 *    	┗ 초기화 방법 : 직접초기화 /static 초기화 블록을 통해 초기화 / 
 *    
 *    
 *   * [final] : 상수 (← 변하지 않는 값)
 *    - 직접 초기화
 *    - 생성자를 통해 초기화
 *      
 */
}
