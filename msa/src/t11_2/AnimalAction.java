package t11_2;

//동물의 행동
public class AnimalAction {

	public void do1(Dog ins) {
		ins.eat("밥");
		ins.sound();
	}
	public void do2(Cat ins) {
		ins.eat("생선");
		ins.sound();
		ins.walk();
	}
	public void do3(Animal ins) {
		ins.eat("사료");
		ins.sound();
	}

}
