package msa18;

class Outer2{ 
	public String name;
	public static String nick;
	
	class Inner2{ //inner class //��� Ŭ����
		public String name2;
//		public static String nick2; //����!! >> inner Ŭ���� �ȿ� (final����) static���� ���� X (final�� Ư��ȭ ��Ű�� �ʴ��� �ٱ��� ��ü�� ����� �����ϹǷ� static ����)
		public static final int su=20;
		
//		public static void prt() {  //static ����
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
