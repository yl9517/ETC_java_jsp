package msa01;

public class VariableTest1 {

	public static void main(String[] args) {
		int a123;
		
		/*
		 *  primitive type : 기본타입
		 *   
		 *   
		 *   				정수	(char 은 문자)					실수
		 *   -------------------------------------   ------------------
		 *   byte	short,char     int  	long   |    float	 double	
		 *  (8bit)   (2byte)	 (4byte)   (8byte) |   (4byte)  (8byte)
		 * 
		 * 
		 *   -> 자동형변환
		 *   <- 강제형변환
		 *   
		 *   boolean (변환X)
		 *   
		 * 
		 */
		
		byte a =10;
		byte b =20;
		System.out.println(a+","+b);  //10,20
		
		long c = a+b; //a+b => 연산하면 int타입으로 변경됨.  (자동형변환) 그러므로 int에 담을 수 있음 
		System.out.println(c);						//이때 int보다 long이 더 크므로 long타입도 a+b를 담을 수 있다.

		
		
		int d =20;
		byte e;
		e = (byte)d;  //int타입의 d는 더 작은타입의  byte에게 쌩으로 들어갈 수 없으므로 (byte)를 작성하여 강제 형변환 후 대입시킨다.
		
		
		
		float f = 10.2f;
		int g = (int) f; //float을 int로 강제형변환
		System.out.println(g);
		
		
		int A = 3;
		char B = (char) A;
		System.out.println(A);
		
		
		long su1 = 10L;
		float su3 = 10.2f;
		
		// float su2 = 10.2;  //f를 붙이지 않으면 double로 인식 (double타입인 10.2를 더 작은  float으로 바꾸려 해서 에러)
		long t1 = 10;  //l를 붙이지 않으면 int타입으로 인식 (int타입인 10을 더 큰 long으로 자동형변환)
		
		
		byte d1 = 10;
		byte d2 = 20;
		byte d3 = (byte)(d1+d2); // "d3 = (byte)d1+b2"는 d1만 byte로 바뀐 것이므로 X, 전체를 감싸주어야 함
		
		
	}
}
