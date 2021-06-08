package msa07;

class Final2{

	static final int su=10; //static final 이라는 순서를 더 많이 씀
	static final int[] su2; //클래스 변수
	static {  //여기서 클래스 변수 초기화  //맨처음 한번 동작함 (참고-test5)
		su2 = new int[3];
		
		for(int i=0; i<su2.length; i++)
			su2[i]=i*100;
		
	}
	
	
}

public class StaticTest4 {

	public static void main(String[] args) {
		int[] arr = Final2.su2;
		
		for(int index:arr)
			System.out.println(index);
		
	}

}
