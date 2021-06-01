package msa02;
/*  switch문   
 * 	switch문의 경우에는 비교연산 등 사용X
 * 
 * */
public class SwtichTest1 {

	public static void main(String[] args) {
		
		int su=1;
		
		switch(su) { //입력값으로 byte,short,int, char,String 타입 받을 수 있음.
		case 1 :
			System.out.println("1");
			break;
		case 2 :
			System.out.println("2");
			break;
		case 3 :
			System.out.println("3");
			break;
		default :
			System.out.println("나머지 숫자");
		}
		
		
		String data = "They";
		
		switch(data) {
		case "He" :
			System.out.println("남자");
			break;
		case "She" :
			System.out.println("여자");
			break;
		case "They" :
			System.out.println("그들");
			break;
		default :
			System.out.println("나머지");
		
		}  //end switch
		

	} //end method

} //end class
