package msa01;

public class VariableTest1 {

	public static void main(String[] args) {
		int a123;
		
		/*
		 *  primitive type : �⺻Ÿ��
		 *   
		 *   
		 *   				����	(char �� ����)					�Ǽ�
		 *   -------------------------------------   ------------------
		 *   byte	short,char     int  	long   |    float	 double	
		 *  (8bit)   (2byte)	 (4byte)   (8byte) |   (4byte)  (8byte)
		 * 
		 * 
		 *   -> �ڵ�����ȯ
		 *   <- ��������ȯ
		 *   
		 *   boolean (��ȯX)
		 *   
		 * 
		 */
		
		byte a =10;
		byte b =20;
		System.out.println(a+","+b);  //10,20
		
		long c = a+b; //a+b => �����ϸ� intŸ������ �����.  (�ڵ�����ȯ) �׷��Ƿ� int�� ���� �� ���� 
		System.out.println(c);						//�̶� int���� long�� �� ũ�Ƿ� longŸ�Ե� a+b�� ���� �� �ִ�.

		
		
		int d =20;
		byte e;
		e = (byte)d;  //intŸ���� d�� �� ����Ÿ����  byte���� ������ �� �� �����Ƿ� (byte)�� �ۼ��Ͽ� ���� ����ȯ �� ���Խ�Ų��.
		
		
		
		float f = 10.2f;
		int g = (int) f; //float�� int�� ��������ȯ
		System.out.println(g);
		
		
		int A = 3;
		char B = (char) A;
		System.out.println(A);
		
		
		long su1 = 10L;
		float su3 = 10.2f;
		
		// float su2 = 10.2;  //f�� ������ ������ double�� �ν� (doubleŸ���� 10.2�� �� ����  float���� �ٲٷ� �ؼ� ����)
		long t1 = 10;  //l�� ������ ������ intŸ������ �ν� (intŸ���� 10�� �� ū long���� �ڵ�����ȯ)
		
		
		byte d1 = 10;
		byte d2 = 20;
		byte d3 = (byte)(d1+d2); // "d3 = (byte)d1+b2"�� d1�� byte�� �ٲ� ���̹Ƿ� X, ��ü�� �����־�� ��
		
		
	}
}
