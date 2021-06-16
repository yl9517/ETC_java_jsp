package msa13;

import java.util.Scanner;

public class StringTest3 {

	public static void main(String[] args) {
		String name ="Abcd";
		int data = name.compareTo("Abd");
		System.out.println(data);
		System.out.println((int) 'c');
		System.out.println((int) 'd');
		
		//String 배열을 이용하여 이름을 외부에 입력받아 5개 입력하고 값을 내림차순으로 정렬
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[5];
		for(int i =0; i<5; i++) {
			System.out.println("이름 : ");
			arr[i] = sc.next();
		}
		
		String temp;
		for(int i=0; i<4; i++) {
			for(int j=i+1; j<5; j++) {
				if(arr[i].compareTo(arr[j])<0) { //i번째가 j번째보다 작으면 (음수면)
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(String i:arr) {
			System.out.println(i);
		}
		
	}

}
