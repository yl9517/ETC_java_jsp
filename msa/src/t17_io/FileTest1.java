package t17_io;

import java.io.File;

public class FileTest1 {

	public static void main(String[] args) {
		File f = new File("D:\\����\\");
		
		String[] flists = f.list();
		
		for(String thisf:flists)
			System.out.println(thisf);
		
		File f2 = new File(f,"sample1");  //f��ġ�� sample1���� ����
		
		boolean result =f2.mkdir(); //f2�� ������ 
		if(result) 
			System.out.println("���� ���� ����");
		else
			System.out.println("���� ���� ����");
		
		
				System.out.println("===========================");
		
		
		File f3 = new File("D:\\����\\sample1","hello.txt");  //sample���� �ȿ� hello ���� ����
		try {
			boolean result2= f3.createNewFile();
			if(result2)
				System.out.println("���� ���� ����!");
			else
				System.out.println("���ϼ��� ����");		
		}catch (Exception e) {
			
		}
		

				System.out.println("===========================");
		
		if(f2.delete())
			System.out.println("����/���� ���� ����"); //���빰�� ������ ���� ���� ����
		else
			System.out.println("����/���� ���� ����");
			
		
		
		
		
	}

}
