package t17_io;

import java.io.PrintStream;

class Sample{
	
}
public class OutputTest {

	public static void main(String[] args) {
		// PrintStream = 바이트 단위로 읽어옴
		PrintStream ps = System.out;
		
		ps.print(true);
		ps.print("aaa");
		ps.print(10.2f);
		ps.print(new Sample());
		ps.printf("%s %d","hong",20);
		
		System.out.println("======\n");
		System.out.printf("%d  %o  %x",10,10,10); //10진수 8진수 16진수
		
	}

}
