package msa09;

import java.util.Scanner;

public class DogTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Dog[] arr = new Dog[5]; //�迭 ����
		
		Dog ins = new Dog("","");
		
		for(int i=0; i<5; i++) {
			System.out.print("������ �̸� �Է� : ");
			String name = sc.next();
			System.out.print("������ �� �Է� : ");
			String type = sc.next();
			
			ins = new Dog(name,type);
			arr[i] = ins;		
		}
		
		for(Dog i:arr)
			System.out.println("�̸� : "+i.getName()+" | �� : "+i.getType());

	}

}
