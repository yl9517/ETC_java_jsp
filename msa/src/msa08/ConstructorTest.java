package msa08;

class P{
	private final int su = 10;  //private : 타 클래스에서 접근 불가
	private int su4 = 20; 
	static int su2 = 30;
	int su3 =10;
	
	
}
public class ConstructorTest {

	
	public static void main(String[] args) {
	//https://docs.oracle.com/javase/8/docs/api/ 여기서 사용법 알 수 있음

		int data = Math.abs(-20);
		System.out.println(data);
	
		int data2 = Math.max(50, 10);
		System.out.println(data2);
		
		P ins = new P();
		
		P.su2 = 20;
	
	}

}
