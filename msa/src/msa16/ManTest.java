package msa16;

public class ManTest {

	public static void main(String[] args) {
		ManPro p1 = new ManPro();
		
		//�ڷ��߰�
		p1.addMan(new Man("a1", 20));
		p1.addMan(new Man("a2", 30));
		p1.addMan(new Man("a3", 30));
		p1.addMan(new Man("a2", 30));
		p1.addMan(new Man("a2", 30));
		p1.addMan(new Man("a2", 30));
		
		
		p1.printAll(); //�� ���

		//a2,30�� ������ �ִ� ��� �ڷ� ����
	//	p1.removeMan(new Man("a2",30));
		
		p1.printAll();
		

		p1.removeMan("a2");
		
		p1.printAll();
	}

}
