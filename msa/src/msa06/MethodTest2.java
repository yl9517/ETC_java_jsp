package msa06;
/*
 * 값 비교 : ==
 * 객체 비교 : equals
 * 
 */
class Man1{
	String name;
}

public class MethodTest2 {

	public static void main(String[] args) {

		Man1 m1 = new Man1();		
		Man1 m2 = new Man1();
		m1 = m2;
		
		m1.name="hong";
		m2.name="kim";
		
		System.out.println(m1.name);//kim
		System.out.println(m2.name);//kim
		System.out.println(m1==m2);//t
		System.out.println(m1);
		System.out.println(m2);

		
		Man1 m3 = new Man1();
		System.out.println(m1==m2);  //t
		System.out.println(m1==m3);  //f

		System.out.println(m1.equals(m2));  //t
		System.out.println(m1.equals(m3));  //f
		
	}
}

