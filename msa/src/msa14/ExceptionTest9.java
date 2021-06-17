package msa14;

import java.util.Scanner;

class UserException extends Exception{
	public UserException() {
		super("�Է¿���/����Է��ؾ���");
	}
}

public class ExceptionTest9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int su = sc.nextInt();
		
		try {
			if(su<0)
				throw new UserException();
			System.out.println("su :"+su);
		}catch (UserException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (Exception e) { //�ڷ� ������ �� ���� �ڽĿ��� �ش�Ǵ� �θ� exception�� �޾��־����
			System.out.println(e);
		}
	}

}
