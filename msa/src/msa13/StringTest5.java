package msa13;

public class StringTest5 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		CharSequence cs = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer(cs);
		StringBuffer sb3 = new StringBuffer(new StringBuilder("eee"));
		StringBuffer sb4 = new StringBuffer(10);
		StringBuffer sb5 = new StringBuffer("aaa");
		
		
		//capacity : 용량
		System.out.println(sb.capacity());  // 16    기본 SB 용량
		System.out.println(sb2.capacity()); // 21  16 + 5글자 합
		System.out.println(sb3.capacity()); // 19  16+3
		System.out.println(sb4.capacity()); // 10  10
		System.out.println(sb5.capacity()); // 19  16+3
		
		
		
	}

}
