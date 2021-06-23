package msa13;

public class StringTest1 {

	public static void main(String[] args) {
		String name = "hong"; //문자열 상수
		String name2 = "hong"; //기존에 "hong"이라고 하는 문자가 있으면 걔를 가르킴
		String name3 = new String("hong"); //메모리 새로 할당해서 만든 문자
		
		//== : 메모리 비교
		System.out.println(name==name2);  //같은 곳을 가르키므로 true
		System.out.println(name==name3);  //false
		System.out.println(name.equals(name2)); // true
		System.out.println(name.equals(name3)); //원래라면 다르지만 자동 toString을 통해 형태가 같으면 같다고 생각하자.해서 true
	}

}
