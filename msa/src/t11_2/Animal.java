package t11_2;

//추상메소드

public abstract class Animal {
	
	public void eat(String food) {
		System.out.println(food+" 먹습니다.");
	}
	
	public abstract void sound();
}
