package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortTest3_Student {

	public static void main(String[] args) {
	
		ArrayList<StudentDTO> arr = new ArrayList<>();
		arr.add(new StudentDTO("01", "hong2", 10));
		arr.add(new StudentDTO("02", "park", 40));
		arr.add(new StudentDTO("03", "hong1", 23));
		arr.add(new StudentDTO("04", "kim", 25));
		arr.add(new StudentDTO("05", "lee", 27));
	
		for(StudentDTO item:arr)
			System.out.println(item);
		
		System.out.println("------------");
		
//		Collections.sort(arr); //내용이 객체은 리스트는 정렬 불가
		
		
		
		//  ★ 정렬하려면 .... studentDTO가 Comparable을 상속받아야 함!!! (compareTo 오버라이딩)	
		Collections.sort(arr); //상속 후 정렬 오류안남
		
		for(StudentDTO item:arr)
			System.out.println(item);
	}

}
