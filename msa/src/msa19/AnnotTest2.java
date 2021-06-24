package msa19;

import java.util.ArrayList;
import java.util.List;


class Sample3{
	@SafeVarargs  //매개변수를 사용할때 경고 억제 (매개변수 타입을 신뢰함)
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
