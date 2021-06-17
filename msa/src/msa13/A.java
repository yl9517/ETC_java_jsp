package msa13;

public class A {
/*
 *  캘린더,String 사용한 HW -> ref(clone) -> String -> StringBuilder
 * 
 * 
 * 얕은 복사 : 주소값 같음(대입) / 단순히 필드값을 복사해서 객체를 복제하는 것 / 참조객체를 변경하면 같이 변경 됨
 * 깊은 복사 : Clone 이용하여 참조하고 있는 객체도 복제 / 원본유지
 * 
 * 
 *  * [clone] : 객체복제
 *  객체복제는 원본객체의 필드값과 동일한 값을 가지는 새로운 객체생성
 * 
 * 
 *  * [String] : 변경을 하지 않는 문자열 (상수)
 * 		ex) String name = "hong";
 * 				   name += "kim";   ▶  "hong"메모리는 냅두고 "hongkim"을 가르키는걸로 바뀜.
 * 								C++에서는 남겨진 "hong"을 못씀 → 용량차지 / 메모리 누수
 * 	  [garbage collection]	→	java에서는 남겨진 "hong" 등 힙메모리에서 사용 안하는 메모리를 주기적으로 검사해서 지움
 *     
 *     이렇게 생성 삭제를 반복하는 것보다 "hong" 뒤에 계속 값이 붙는것이 더 좋음
 *     
 * 	String의 상위버전
 *  	버퍼기능을 포함한 문자열 표현, 조작을 하기위한 문자열 객체 
 * 	* [StringBuffer] : 동기화 처리  
 * 	* [StringBuilder] : 비동기처리 (속도가 높다.)
 * 
 * 
 * 임계역역 (critical section) : 공유자원
 * 
 * 
 *  * [compareTo]
 * 
 * 
 */
}
