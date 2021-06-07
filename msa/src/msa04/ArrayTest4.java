package msa04;
/*
 * 문자열 배열
 */
import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {

		String[] names = new String[4];
		names[0] = "hong";
		names[1] = "kim";
		names[2] = "lee";
		names[3] = "park";
		

		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
	}

}
