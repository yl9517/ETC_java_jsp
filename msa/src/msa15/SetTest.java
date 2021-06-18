package msa15;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> s = new HashSet<String>();
		s.add("park");
		s.add("a1");
		s.add("a2");
		s.add("a1");
		
		Iterator<String> ita = s.iterator();
		
		while(ita.hasNext())
			System.out.println(ita.next()); //중복x 순서x
		
	}

}
