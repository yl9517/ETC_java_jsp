package msa06;

import java.util.Scanner;

/*
 * [����1]
 * 1. Dog Ŭ������ ����� ������� name,type �� ����� (���String)
 * 2. getter,setter,������ ����
 * 3. dog Ŭ���� �̿��Ͽ� dogTestŬ������ �迭ũ�Ⱑ 5�� dog[] �迭 ���� �� dog �ν��Ͻ��� 5�� �����Ͽ� �迭�� �߰�
 * 4. for���� ���� for������ dogŬ������ getter�޼ҵ带 �̿��Ͽ� �߰��� ���� ���
 * 
 * 
 * ��Ʈ) 1. String�� Ŭ������, Ŭ������ �迭�� ����� �ִ�
 * 		2.Ŭ������ ������=null; ������.��¸޼ҵ�(); ��  NullPointerException

 */
public class DogTest_question{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Dog[] dogs = new Dog[5]; //�迭
		
		for(int i=0; i<dogs.length; i++) {
			Dog ins = new Dog();
			
			System.out.print("������ �̸��� �Է����ּ��� : ");
			ins.setName(sc.next());
			System.out.print("������ ���� �Է����ּ��� : ");
			ins.setType(sc.next());
			
			dogs[i] = ins;
		}

		for(Dog index:dogs) { //dog�� ���̸�ŭ �ݺ�
			System.out.print(index.getName()+" ");
			System.out.print(index.getType());
			System.out.println();
		}
		
		
	}
	
}