package msa07;
class Man1{
	//public void prt() {}
	//아래와 같은 메소드라서 에러
	
	public String prt() {
		return "hong";
	}
	
}

public class MethodTest {

	public static void main(String[] args) {
		Method ins1 = new Method();
		ins1.modify("hong", 20);
		ins1.print();
		
		
		Method ins2 = new Method();
		ins2.modify("kim", "서울");
		ins2.print();
		
		
		Man1 ins = new Man1();
		String name = ins.prt();
		System.out.println(name);
		System.out.println("------");
		ins.prt(); //prt는 return값을 준다고 하지만 안받은것
		
	}

}
