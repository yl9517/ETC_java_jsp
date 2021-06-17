package msa14;

import java.util.Scanner;

class UserException extends Exception{
	public UserException() {
		super("입력오류/양수입력해야함");
	}
}

public class ExceptionTest9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int su = sc.nextInt();
		
		try {
			if(su<0)
				throw new UserException();
			System.out.println("su :"+su);
		}catch (UserException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (Exception e) { //뒤로 갈수록 더 많은 자식에게 해당되는 부모 exception이 받아주어야함
			System.out.println(e);
		}
	}

}
