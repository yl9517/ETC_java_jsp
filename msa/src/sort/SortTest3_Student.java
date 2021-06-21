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
		
//		Collections.sort(arr); //������ ��ü�� ����Ʈ�� ���� �Ұ�
		
		
		
		//  �� �����Ϸ��� .... studentDTO�� Comparable�� ��ӹ޾ƾ� ��!!! (compareTo �������̵�)	
		Collections.sort(arr); //��� �� ���� �����ȳ�
		
		for(StudentDTO item:arr)
			System.out.println(item);
	}

}
