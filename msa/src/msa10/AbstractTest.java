package msa10;
/*
 * 
 */
abstract class Dog{
	public void sound() {
		System.out.println("멍멍");
	}
	public void eat() {
		System.out.println("밥을 먹습니다.");
	}
	public abstract void act(); //추상메소드 - 이 경우 상속 받는 자식에서 제대로 정의해주어야함

}


class GoldenRetriever extends Dog{
	
	@Override
	public void act() {
		System.out.println("벽을 부순다");				
		System.out.println("소파를 뜯는다");
	}
	
}
class ShihTzu extends Dog{
	@Override
	public void act() {
		System.out.println("휴지를 뽑는다");
		System.out.println("코를 곤다");
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		
//		Dog ins = new Dog(); //추상클래스 dog로 객체 못만들으므로 에러
//		GoldenRetriever ins3 = new Dog(); //추상클래스 dog로 객체 못만들으므로 에러
		
		GoldenRetriever ins = new GoldenRetriever();
		
		Dog ins2 = new GoldenRetriever();		
		ins2.sound();
		ins2.eat();
		ins2.act();
		
		ins2 = new ShihTzu(); //다형성 구현
		ins2.act();
	}

}
