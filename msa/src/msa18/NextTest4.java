package msa18;

class Outer4{ 
	
	String dept="abc";
	
	public void prt() {
		System.out.println("prt");
	
		String name="hello"; //��������
	
		class Sample2 {	//���� Ŭ����(local inner class)
			 
			void paint() {
				System.out.println(dept);
				System.out.println(name);
				System.out.println("paint");
			}
		} //sampleŬ����
		
		Sample2 ins = new Sample2();
		ins.paint();
		
	} //prt�޼ҵ�
	
	public void view() {
//		Sample2 ins = new Sample2();  //����

	}
	
} //outer4 Ŭ����

public class NextTest4 {

	public static void main(String[] args) {

		Outer4 ins = new Outer4();
		ins.prt();
		System.out.println("----");
		ins.view();
		
	}

}
