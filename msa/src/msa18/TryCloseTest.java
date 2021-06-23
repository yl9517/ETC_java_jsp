package msa18;

import java.io.Closeable;
import java.io.IOException;

import com.sun.org.apache.xerces.internal.xni.parser.XMLParseException;

class Sample implements Closeable{
	void prt() throws IOException,XMLParseException {
		System.out.println("prt");
	}

	@Override
	public void close() throws IOException {
		System.out.println("close method");
		
	}
}
public class TryCloseTest {

	public static void main(String[] args) {
//		Sample ins = null;
//		try {
//			ins = new Sample();
//			ins.prt();
//		}catch (IOException | XMLParseException e) { // or |
//			System.out.println(e);
//		}finally {
//			if(ins!=null)
//				try {
//					ins.close();
//				}catch (Exception e2) {
//
//				}
//		}
		

		try(Sample ins = new Sample()) { //try-with-resources
			ins.prt();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
