package msa11;
abstract class Dog{
	private String name;
	public static int age;
	
	public Dog() {
		
	}
	
	public static void prt() {  //static 사용가능
		System.out.println("prt");
	}
	
	public void sound() {
		System.out.println("멍멍");
	}
	public void eat() {
		System.out.println("밥을 먹습니다.");
	}
	
	public abstract void act(); //추상메소드 - 이 경우 상속 받는 자식에서 제대로 정의해주어야함
		
	
}


class ShihTzu extends Dog{
	@Override
	public void act() {
		System.out.println("휴지를 뽑는다");
		System.out.println("코를 곤다");
	}
	
	public void fav() {
		System.out.println("자기");
	}
}

public class AbTest {

	public static void main(String[] args) {
		
//		Dog ins = new Dog(); //추상클래스 dog로 객체 못만들으므로 에러
//		GoldenRetriever ins3 = new Dog(); //추상클래스 dog로 객체 못만들으므로 에러

		Dog ins = new ShihTzu();
		ins.act();
		ins.sound();
		Dog.age=23;
		
		System.out.println("==");
		
		ShihTzu ins2 = new ShihTzu();
		ins2.act();
		ins2.sound();
		ins2.fav();
	}
}