package msa15;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


class Sample{

	public void prt(List<String> arr) { //출력..
//		for(String i:arr)
//			System.out.println(i);
		
		Iterator<String> ita = arr.iterator(); //iterator :
		
		while(ita.hasNext()) { //hasnext :다음자료있니? t/f
			String data= ita.next();
			System.out.println(data);
		}
		
	}
}
public class ArrayListTest5 {

	public static void main(String[] args) {
		Sample ins = new Sample();
		 
		List<String> arr= new ArrayList<>(); //부모= new 자식
		arr.add("hong");
		arr.add("kim");
		arr.add("park");
		
		ins.prt(arr);
	}
	
}
