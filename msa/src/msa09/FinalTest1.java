package msa09;

class Final1{
	public void prt() {
		System.out.println("final1 prt method");
	}
}
class SubFinal1 extends Final1{
	@Override  //재정의 : 부모에서 정의된 메서드를 자식클래스에서 재정의
	public void prt() {
		System.out.println("SubFinal1");
	}
}
public class FinalTest1 {

	public static void main(String[] args) {
		
	}

}
