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
	public void prt() throws IOException{  //오버라이딩한 자식메소드는 예외처리가 부모메소드와 같거나 적어야함
			
	}
}
public class OverrideTest {

	public static void main(String[] args) {



	}

}
