package t17_io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileTest2_writer {

	public static void main(String[] args) {

		BufferedWriter bw = null;
		File f = new File("D:\\����\\myboard");
		
		
		try {
			boolean result = f.mkdir(); //���� ����
			if(result)
				System.out.println("���� �����Ϸ�");
			else
				System.out.println("���� ��������");
			
			
//			bw = new BufferedWriter(new FileWriter("D:\\����\\myboard/myfav.txt"));
			bw = new BufferedWriter(new FileWriter(new File(f,"myfav2.txt"),true));  //true = ������ �̹� ������ �̾ ��
			
			bw.write("ȣ�ø� ���°ž�");
			bw.write("������ �氡");
			bw.newLine();
			bw.write("���� �̸���");
			bw.newLine();
			bw.write("ȫ�浿�Դϴ�.");
			System.out.println("���� ���� �Ϸ�");
			
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			if(bw!=null)
				try {
					bw.close();
				}catch (Exception e2) {
				}
		}
		
		
		
	}

}
