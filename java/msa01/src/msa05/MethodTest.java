package msa05;
/*
 * 되돌려주는 값 없는 void 메소드
 * 
 */
class Person2{
	
	void prt(){
		System.out.println("prt method call");
	}
	void draw(String data) { //date = 매개변수 인자(Argument)
		System.out.println(data+"를 그립니다");
	}
	void cal(int a,float b,long c,char d,String e) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	void think(int su, int su2) {
		System.out.println("su1 : "+ su +", "+su2);
	}
	
}


public class MethodTest {

	public static void main(String[] args) {
		Person2 ins = new Person2();
		//ins 가 인스턴스(객체를 실체화)  //new Person2();가 객체
		ins.prt();
		ins.draw("고릴라");
		ins.cal(10, 20.2f, 30L, 'a', "hong");

		int data1 = 10;
		int data2 = 20;
		ins.think(data1, data2);
		
		
	}

}
