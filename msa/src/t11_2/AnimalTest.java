package t11_2;

public class AnimalTest {

	public static void main(String[] args) {

		AnimalAction ins = new AnimalAction();
		
		ins.do1(new Dog());	
		ins.do2(new Cat());
		
		ins.do3(new Dog());
		ins.do3(new Cat());
	}

}
