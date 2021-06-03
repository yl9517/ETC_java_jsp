package msa04;
/*
 * value : 값
 * 
 * variable : 변수
 * 
 */
public class ArrayTest2 {

	public static void main(String[] args) {

//		int su = 10; //초기화
//		
//		int su2;
//			su2=10;  //변수에 값을 할당함
		
		int[] arr = new int[3];
		System.out.println(arr.length); //length : 해당 객체의 자릿수
		
		for(int i=0; i<arr.length; i++) 
			System.out.println(arr[i]);
		
		
		System.out.println("-----------");
		
		//값 할당히기
		arr[0] = 100;
		arr[1] = 200;
		
		for(int i=0; i<arr.length; i++) 
			System.out.println(arr[i]);
		
		
		System.out.println("-----------");
		
		
		int[] arr2= {10,20,30,40}; 		//바로 초기값 넣어주기
		
		for(int i=0; i<arr2.length; i++) 
			System.out.println(arr2[i]);
		
		
		
		
	}

}
