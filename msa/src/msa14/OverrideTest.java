package msa14;

import java.awt.AWTException;
import java.io.IOException;

import com.sun.org.apache.xerces.internal.xni.parser.XMLParseException;

class A1{
	void prt() throws IOException, XMLParseException,AWTException{
		System.out.println("prt");
	}
}
class A2 extends A1{
	@Override
	public void prt() throws IOException{  //�������̵��� �ڽĸ޼ҵ�� ����ó���� �θ�޼ҵ�� ���ų� �������
			
	}
}
public class OverrideTest {

	public static void main(String[] args) {



	}

}
