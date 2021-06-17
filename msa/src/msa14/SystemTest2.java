package msa14;

import java.io.PrintStream;

public class SystemTest2 {

	public static void main(String[] args) {

		int[] arr = {10,20,30,40,50};
		int[] arr2=arr;
		
		arr2[1]=100;
		
		for(int i:arr)
			System.out.print(i+" ");
			
					System.out.println();
		
		for(int i:arr2)
			System.out.print(i+" ");
		
		System.out.println("\n----------------------------");
		
		int[] arr3 = {10,20,30,40,50};
		int[] arr4 = {100,200,300,400,500,600};
		
		
		System.arraycopy(arr3, 1, arr4, 2, 3); //arr3배열의 1번째부터의 값을 arr4배열의 2번쨰인덱스부터 3개 복제하겠다.
												// → arr3배열의 1번째~3번째 값을 arr4배열의 2번째자리부터 덮어써서 복제하겠다
		
		for(int i:arr3)
			System.out.print(i+" ");
		
				System.out.println();
				
		for(int i:arr4)
			System.out.print(i+" ");
	}

}
