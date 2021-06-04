package msa05;

public class ForTest {

	public static void main(String[] args) {

		int[] arr = {10,20,30};
		
//		for(int i=0; i<arr.length; i++) 
//			System.out.println(arr[i]);
		
		//jdk5버전 이상으로는 아래처럼 씀
		for(int a:arr)
			System.out.println(a);
		
	
		String[] names= {"lee","hong","kim"};
		
		for(String n:names)
			System.out.println(n);
		
		
	}

}
