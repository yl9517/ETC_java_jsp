package msa14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest3 {

	public static void main(String[] args) throws IOException {
		
		
		//runTime�� �ƴ� Exception�� �ٷ� ������ ��Ÿ�� -> �׷��� checked Exception 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input name");
		String name = br.readLine();
		
		// throws = ��������x 
		// try...catch = ���� ó��
		String data=null;
		System.out.println(data.toString());
	}

}
