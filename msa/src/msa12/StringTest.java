package msa12;


public class StringTest {

	public static void main(String[] args) {
		
		String a1 = new String();
		String a2 = new String("abcdefg");
		String a3 = new String(new char[] {'a','b','c','d','e','f','g'});
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		
		char ch1 = a3.charAt(0); //charAt(n) : n번째 문자 뽑아내기
		System.out.println(ch1);
		System.out.println(a3.length());
		System.out.println(a2.substring(0, 3));
		
		String result = a3.concat("12345"); //concat : 연결
		System.out.println(result);
		System.out.println(a2.equals(a3));
		
		
	}

}
