package msa13;

public class StringTest2 {

	public static void main(String[] args) {
		String name ="hong";
		String name2 = new String("hong");
		
		char ch = name.charAt(0);
		System.out.println(ch);
		System.out.println("-----");
		
		
			// charAt() �̿��ؼ� hnog
			for(int i=name.length()-1; i>=0; i--) {
				System.out.print(name.charAt(i));
			}
			
		System.out.println();
		
		
		String data1="hong";
		
		int result = data1.compareTo("hon"); //hong�� hon���� �� ũ�Ƿ� ���
		System.out.println(result);
		int result2 = data1.compareTo("hong");//hong�� hong�� �����Ƿ� 0
		System.out.println(result2);
		int result3 = data1.compareTo("park");//h�� p���� �����Ƿ� ����
		System.out.println(result3);
		

		
	}

}

