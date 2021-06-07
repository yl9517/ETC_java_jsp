package msa01;

/*
 * 복합대입
 * 
 */
public class Optest6 {

	public static void main(String[] args) {
		
		int su=10;
		
		su+=2; //su = su+2;
		System.out.println(su);
		su-=1; //su = su-1;
		System.out.println(su);
		su*=2; //su = su*2;
		System.out.println(su);
		su/=2; //su = su/2;
		System.out.println(su);
		su%=2; //su = su%2;
		System.out.println(su);
		
		
		int su1 = 2;
		int su2 = 5;
		int su3 = 4;
		su1*=su2+su3; //su = su*(su2+su3)
		System.out.println(su1);
		

	}

}
