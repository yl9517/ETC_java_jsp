package msa18;

class Outer3{ 
	public String irum="aa";
	
	static class Inner3{	//static inner class
		String name;
		public static String nick;
		
		public void prt() {
			nick="aaa";
//			System.out.println(irum);  //오류! outer3는 객체를 new로 생성해야하기 때문
			System.out.println("prt");
		}
		public static void paint() {  //static 클래스면 static메소드 생성 가능
			System.out.println("paint");
		}
	
	}
}

public class NextTest3 {

	public static void main(String[] args) {
		Outer3.Inner3.paint();
		
		Outer3.Inner3 ins = new Outer3.Inner3();
		ins.prt();
		ins.name="park";
		Outer3.Inner3.nick="abc";
		
		
	}

}
