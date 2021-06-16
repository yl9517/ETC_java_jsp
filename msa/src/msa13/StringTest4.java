package msa13;

interface A1{
	void prt();
}
class Aimple implements A1{
	public void prt() {
		System.out.println("prt");
	}
	public void view() {
		System.out.println("view");
	}
}

class Sample{
	public Sample(A1 ins) {
		ins.prt();
	}
}

public class StringTest4 {

	public static void main(String[] args) {
		Aimple obj = new Aimple();
		Sample ins = new Sample(obj);
		
		A1 obj2 = new Aimple();
		Sample ins2 = new Sample(obj2);

		
	}

}
