package t17_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileTest2_reader {

	public static void main(String[] args) {

		//�Ѳ����� �о���� ���
		BufferedReader br = null;
	
		try {
			br = new BufferedReader(new FileReader("D:\\����\\myboard\\myfav2.txt"));

			String str = "";
			while((str = br.readLine())!=null) {
				
//				str = br.readLine();
//				
//				if(str==null) //���ڳ����� null��µǹǷ�
//					break;		
				// �̰� �ٷ� whiel�� ���ǹ��� �ֱ�
				
				System.out.println(str);
			}
			
		}catch (Exception e) {
			System.out.println("�ش� ���� �����ϴ�"+e);
		}finally {
			if(br!=null)
				try {
					br.close();
				}catch (Exception e2) {
				}
		}
		
	}

}
