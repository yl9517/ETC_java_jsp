package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortTest {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(40);
		arr.add(20);
		arr.add(30);
		arr.add(5);
		
		for(Integer item:arr)
			System.out.println(item);
		
			System.out.println("------");
			
		Collections.sort(arr); //Á¤·Ä
		
		for(Integer item:arr)
			System.out.println(item);
		
	}

}
