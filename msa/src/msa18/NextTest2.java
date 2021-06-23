package msa18;

class Outer2{ 
	public String name;
	public static String nick;
	
	class Inner2{ //inner class //멤버 클래스
		public String name2;
//		public static String nick2; //오류!! >> inner 클래스 안에 (final없이) static으로 선언 X (final로 특수화 시키지 않는한 바깥에 객체를 만들고 들어가야하므로 static 못씀)
		public static final int su=20;
		
//		public static void prt() {  //static 오류
//			System.out.println("prt");
//		}
		
	}


}

public class NextTest2 {

	public static void main(String[] args) {

		Outer2 ins = new Outer2();
		ins.name="hong";		
		System.out.println(ins.name);
		Outer2.nick="abc";
		System.out.println(Outer2.nick);
		
				System.out.println("----------------");
		
		Outer2.Inner2 obj = ins.new Inner2();
		obj.name2 = "kim";
		System.out.println(obj.name2);
		System.out.println(Outer2.Inner2.su);
		
		
	}

}
