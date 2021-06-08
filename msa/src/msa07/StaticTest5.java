package msa07;

class Sample1{
	
	static {  //클래스 읽어질때 맨처음 한번 동작
		System.out.println("static 초기화 블록"); 
	}
//	{  //굳이 쓸필요X, 생성자에서 하면 됨
//		System.out.println("초기화 블록");
//	}
	
	Sample1(){
		System.out.println("생성자!!");
	}
	
}

public class StaticTest5 {

	public static void main(String[] args) {
		Sample1 ins = new Sample1();  //
		Sample1 ins2 = new Sample1(); //이미 위에서 한번 읽었기 때문에 static 안읽음
		Sample1 ins3 = new Sample1();
	}

}
