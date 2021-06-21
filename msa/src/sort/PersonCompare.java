package sort;

import java.util.Comparator;

public class PersonCompare implements Comparator<PersonDTO>{

	@Override
	public int compare(PersonDTO o1,PersonDTO o2) {
		//return o1.getAge()-o2.getAge();
		return o1.getName().compareTo(o2.getName()); //String¿∫ compareTo
	}

	
}
