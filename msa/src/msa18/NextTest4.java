package msa18;

class Outer4{ 
	
	String dept="abc";
	
	public void prt() {
		System.out.println("prt");
	
		String name="hello"; //지역변수
	
		class Sample2 {	//지역 클래스(local inner class)
			 
			void paint() {
				System.out.println(dept);
				System.out.println(name);
				System.out.println("paint");
			}
		} //sample클래스
		
		Sample2 ins = new Sample2();
		ins.paint();
		
	} //prt메소드
	
	public void view() {
//		Sample2 ins = new Sample2();  //오류

	}
	
} //outer4 클래스

public class NextTest4 {

	public static void main(String[] args) {

		Outer4 ins = new Outer4();
		ins.prt();
		System.out.println("----");
		ins.view();
		
	}

}
