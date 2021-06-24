package msa19;

class Sample1{
	@Deprecated		//이 메서드를 더이상 쓰지 않겠다.
	public void prt() {
		System.out.println("Sample1-prt");
	}
	public void paint() {
		System.out.println("Sample1-paint");
	}
}
class Sample2 extends Sample1{
	public void view() {
		System.out.println("Sample2-view");
	}
	
	@Override
	public void paint() {
		System.out.println("Sample2-paint");
	}
}

public class AnnotTest {

	public static void main(String[] args) {
		Sample1 ins = new Sample2();
		
		ins.paint();
		ins.prt();
		
	}

}
