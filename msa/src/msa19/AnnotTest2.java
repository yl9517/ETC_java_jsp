package msa19;

import java.util.ArrayList;
import java.util.List;


class Sample3{
	@SafeVarargs  //�Ű������� ����Ҷ� ��� ���� (�Ű����� Ÿ���� �ŷ���)
	static <T> List<T> asList(T...tlists){
		List<T> result = new ArrayList<>();
		
		for(T list: tlists)
			result.add(list);
		
		return result;
	}
}

public class AnnotTest2 {

	public static void main(String[] args) {

		List<String> arr = new Sample3().asList("hong","kim","park");
		
		for(String item:arr)
			System.out.println(item);
		
	}

}
