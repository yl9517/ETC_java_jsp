package msa17;

public class A {
/*
 * 		HashMap -> random -> t.17_io -> in -> out -> file w,r,test
 * 
 * 
 * 
 * ----------------------------------------------------------------------------------
 * 		 	문자			바이트
 * 입력	   reader	   inputStream
 * 출력	   writer 	   outputStream
 * 
 * 
 *  [기반클래스]
 * 		표준입출력  System.out   System.in
 * 		파일	   FileReader/FileWriter  FileInputStream/FileOutputStream
 * 	[보조클래스]
 * 		=> 그외 (InputStreamReader / BufferedReader / BufferedWriter / objectOutputStream / ObjectInputStream(Sirialize 상속)...)
 * 
 * 차이 : 기반클래스는 직접 쓰고 읽는 기능 O
 *  	 보조클래스는 직접 쓰고 읽는 기능 X
 * 
 * 
 * -----------------------------------------------------------------------------------
 * 
 * stream = 단방향
 * 
 * InputStream / PrintStream = 바이트 단위로 읽어옴
 * Reader = 문자단위로 읽어옴
 * 
 * InputStreamReader = 바이트정보를 문자단위로 바꿔줌
 * 0
 * BufferedReader = 버퍼기능이 포함된 "저장단위" (한꺼번에 읽어옴)  = 자체적으로 읽어오는 기능 없음 => 그래서 표준입출력장치인 system.in(소스)를 InputStreamReader통해 기능 가져옴
 * FileOutputStream = 파일을 바이트 단위로 출력함
 * 
 */
}
