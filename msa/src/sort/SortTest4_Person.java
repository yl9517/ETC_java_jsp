package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortTest4_Person {

	public static void main(String[] args) {
	
		ArrayList<PersonDTO> arr = new ArrayList<>();
		arr.add(new PersonDTO("hong2", 10));
		arr.add(new PersonDTO("park", 40));
		arr.add(new PersonDTO("hong1", 23));
		arr.add(new PersonDTO("kim", 25));
		arr.add(new PersonDTO("lee", 27));
	
		for(PersonDTO item:arr)
			System.out.println(item);
		
		System.out.println("------------");
		
//		Collections.sort(arr); //������ ��ü�� ����Ʈ�� ���� �Ұ�
		
		
		
		//  �� �����Ϸ��� ....  PersonCompareŬ�������� Comparator ���
		Collections.sort(arr, new PersonCompare()); //��� �� ���� �����ȳ�
		
		for(PersonDTO item:arr)
			System.out.println(item);
	}

}
