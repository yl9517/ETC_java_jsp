package msa15;

//<E> = 제네릭 : 객체 타입을 지정

import java.util.ArrayList;
import java.util.Date;


public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>(3);
		
		arr.add("hong");
		arr.add("kim");
//		arr.add(new Date()); //제네릭이 String이므로 에러남
		
		arr.add("park");
		arr.add("lee");
		
		System.out.println(arr.size()); //가변배열이므로 size 4개됨
		
		for(int i=0; i<arr.size(); i++) {
			String name = arr.get(i);
			System.out.print(name+" ");
		}
		
		System.out.println();

		
		for(String i:arr)
			System.out.print(i+" ");
		
		
				System.out.println("\n------------------------------------------");
				
		
		ArrayList<Man> arr2 = new ArrayList<Man>();
		
		arr2.add(new Man("hong", 20));
		arr2.add(new Man("kim", 30));
		arr2.add(new Man("lee", 40));
		arr2.add(new Man("park", 70));
		
		for(Man item:arr2)
			System.out.println(item);

				System.out.println("---------------------");
				
		arr2.remove(2);
		arr2.add(new Man("Han", 70));
		
		System.out.println(arr.get(2));
		

	}

}
