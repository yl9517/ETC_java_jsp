package msa07;

class Person2{
	
//	void prt(String name) {
//		System.out.println(name);
//	}
//	void prt(String name,String addr) {
//		System.out.println(name);
//		System.out.println(addr);
//	}
//	void prt(String name,String addr,String postCode) {
//		System.out.println(name);
//		System.out.println(addr);
//		System.out.println(postCode);	
//	}
	
	//매개변수가 몇개인지 모를때 "...변수이름"  ▶   배열로 인식
	void prt(String ...items) { //item 배열

		for(String item:items) {
			System.out.print(item);
		}
		System.out.println();

	}
	void prt(int su,String ...items) { //이런것도 가능 

	}
	
	
}

public class Argu {
	public static void main(String[] args) {
		Person2 ins = new Person2();
		
		ins.prt("Hong");
		ins.prt("Hong","Seoul");
		ins.prt("Hong","Seoul","1111");
		ins.prt("Hong","Seoul","1111","eeeeeee");
		
	
	}
}
