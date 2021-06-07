package msa06;
/*
 	main에서 배열 입력 후 access3에서 prt메소드 출력
 */

public class Access3Test {
	public static void main(String[] args) {
		//String[] arr = {"10","20","30"};
		
		Access3 ins = new Access3();

		// 배열 바로넣기
		ins.prt(new String[] {"10","20","30"});

	}
}
