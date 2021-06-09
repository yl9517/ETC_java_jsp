package msa08;

class Phone{ //부모클래스
	private String model; //외부에서 접근 불가
	private String color;
	
	public void call() {
		System.out.println("전화를 겁니다.");
	}
	
	
	
}

class SmartPhone extends Phone{ //super1 클래스 상속받은 자식클래스
	private String os;
	
	public void sendtMsg() {
		System.out.println("메세지를 보냅니다");
	}
	public void listenToMusic() {
		System.out.println("음악을 듣습니다.");
	}
	
}

public class SuperSubTest2 {

	public static void main(String[] args) {
		SmartPhone sp1 = new SmartPhone();
		sp1.sendtMsg();
		sp1.listenToMusic();
		sp1.call();
		
	}

}
