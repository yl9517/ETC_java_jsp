package msa13;

public class StringBuilderTest2 {
	public static void main(String[] args) {
		
 			String test1 = "hong";
 			StringBuilder test3 = new StringBuilder("hong");

 			System.out.println(test1.equals(test3)); //주소값 비교
 			System.out.println(test1.contentEquals(test3)); //내용 비교
		 
	}
}
