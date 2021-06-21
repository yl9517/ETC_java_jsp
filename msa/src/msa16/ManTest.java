package msa16;

public class ManTest {

	public static void main(String[] args) {
		ManPro p1 = new ManPro();
		
		//자료추가
		p1.addMan(new Man("a1", 20));
		p1.addMan(new Man("a2", 30));
		p1.addMan(new Man("a3", 30));
		p1.addMan(new Man("a2", 30));
		p1.addMan(new Man("a2", 30));
		p1.addMan(new Man("a2", 30));
		
		
		p1.printAll(); //다 출력

		//a2,30을 가지고 있는 모든 자료 삭제
	//	p1.removeMan(new Man("a2",30));
		
		p1.printAll();
		

		p1.removeMan("a2");
		
		p1.printAll();
	}

}
