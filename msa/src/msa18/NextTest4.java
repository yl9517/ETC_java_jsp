package msa18;

class Outer4{ 
	
	String dept="abc";
	
	public void prt() {
		System.out.println("prt");
	
		String name="hello"; //��������
	
		class Sample {	//���� Ŭ����(local inner class)
			 
			void paint() {
				System.out.println(dept);
				System.out.println(name);
				System.out.println("paint");
			}
		} //sampleŬ����
		
		Sample ins = new Sample();
		ins.paint();
		
	} //prt�޼ҵ�
	
	public void view() {

	}
	
} //outer4 Ŭ����

public class NextTest4 {

	public static void main(String[] args) {

		Outer4 ins = new Outer4();
		ins.prt();
		
	}

}
