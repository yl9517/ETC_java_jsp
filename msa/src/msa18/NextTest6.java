package msa18;

interface Hello{
	void sayHello();
}


public class NextTest6 {

	public static void main(String[] args) {

		Hello ins = new Hello() {
			
			@Override
			public void sayHello() {
				System.out.println("안녕하세요");
			}
		};  //익명클래스  anonymous class (이름이 안보여서)
		ins.sayHello();
		
		
				System.out.println("---------------");
		
		ins = new Hello() {
			
			@Override
			public void sayHello() {
				System.out.println("hello");
				
			}
		};
		ins.sayHello();
		
	}

}
