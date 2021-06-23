package msa13;

public class StringTest2 {

	public static void main(String[] args) {
		String name ="hong";
		String name2 = new String("hong");
		
		char ch = name.charAt(0);
		System.out.println(ch);
		System.out.println("-----");
		
		
			// charAt() 이용해서 hnog
			for(int i=name.length()-1; i>=0; i--) {
				System.out.print(name.charAt(i));
			}
			
		System.out.println();
		
		
		String data1="hong";
		
		int result = data1.compareTo("hon"); //hong이 hon보다 더 크므로 양수
		System.out.println(result);
		int result2 = data1.compareTo("hong");//hong이 hong이 같으므로 0
		System.out.println(result2);
		int result3 = data1.compareTo("park");//h가 p보다 작으므로 음수
		System.out.println(result3);
		

		
	}

}

