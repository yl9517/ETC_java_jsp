package msa02;

import java.util.Scanner;

/*  switch��   
 * 	switch���� ��쿡�� �񱳿��� �� ���X
 * 
 * */
public class SwtichTest4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("hello �� �ѱ��� �Է�");
		
		String data = sc.nextLine();
		
		switch(data) {
		
		case "h" :
			System.out.print("h");
		case "e" :
			System.out.print("e");
		case "l" :
			System.out.print("ll");
		case "o" :
			System.out.print("o");
			break;
		default :
			System.out.print("�߸� �Է��Ͽ����ϴ�");
		}
		

	}

}
