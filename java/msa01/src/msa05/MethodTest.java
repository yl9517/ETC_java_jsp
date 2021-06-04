package msa05;
/*
 * 
    클래스 : 같은 종류의 집단에 속하는 속성과 행위의 정의
    객체 : 클래스를 인스턴스화(실체화) 한 것 (클래스에 메모리를 주입하면 객체 생성)
    
    메소드(int 매개변수)
    void = 돌려줄 값 없음
    
    int타입도 저장하려면 주소를 쓰긴하는데 int타입의 주소값을 출력하는 방법도 있는지? 없음. 자바자체에서 포인터 없앰
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
