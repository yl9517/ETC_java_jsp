package msa15;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


class Sample{

	public void prt(List<String> arr) { //���..
//		for(String i:arr)
//			System.out.println(i);
		
		Iterator<String> ita = arr.iterator(); //iterator :
		
		while(ita.hasNext()) { //hasnext :�����ڷ��ִ�? t/f
			String data= ita.next();
			System.out.println(data);
		}
		
	}
}
public class ArrayListTest5 {

	public static void main(String[] args) {
		Sample ins = new Sample();
		 
		List<String> arr= new ArrayList<>(); //�θ�= new �ڽ�
		arr.add("hong");
		arr.add("kim");
		arr.add("park");
		
		ins.prt(arr);
	}
	
}
