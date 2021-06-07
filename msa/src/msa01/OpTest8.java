package msa01;

public class OpTest8 {

	public static void main(String[] args) {
		
		//단항연산자
		// ++a : 전위연산자
		// a++ : 후위연산자
		
		int x=10;  
		int y=++x;  //  (++x => x=x+1;이므로  x=11) "x에 ++한 값"을 y에 대입 
		System.out.println(x);
		System.out.println(y);
		
		x=10;
		y=x++;      //"y에 x를 먼저 대입" 후 x=x+1
		System.out.println(x);
		System.out.println(y);
		
		
		x=10;
		y=--x; //x먼저 계산 후 대입
		System.out.println(x);
		System.out.println(y);

		x=10;
		y=x--; //먼저 대입 후 x계산
		System.out.println(x);
		System.out.println(y);
		

	}

}
