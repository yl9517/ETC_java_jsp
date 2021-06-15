package msa12;

class Sample{ //extend Object
	private String name;
	private int age;
	
	public Sample(String name,int age) {
		this.name=name;
		this.age=age;
	}
}

public class ObjectTest1 {

	public static void main(String[] args) {
		
		Sample ins = new Sample("hong", 10);
		String data = ins.toString();
		System.out.println(data);
		System.out.println(ins.toString());
		System.out.println(ins); //toString 자동호출
	}

}
