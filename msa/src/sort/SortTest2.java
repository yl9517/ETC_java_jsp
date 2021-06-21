package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortTest2 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("park");
		arr.add("kim");
		arr.add("kang");
		arr.add("ahn");
		arr.add("hong");
		
		for(String item:arr)
			System.out.println(item);
		
			System.out.println("------");
			
		Collections.sort(arr); //Á¤·Ä

		for(String item:arr)
			System.out.println(item);
		
	}

}
