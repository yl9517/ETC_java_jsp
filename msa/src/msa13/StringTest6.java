package msa13;

public class StringTest6 {

	public static void main(String[] args) {

		// compareToIgnoreCase : ��ҹ��� ���������ʰ� ��
		String name = "abc";
		System.out.println(name.compareToIgnoreCase("ABC"));
		
		//concat : �̾���̱�
		name=name.concat("1111");
		System.out.println(name);
		
		//contains : ���ԵǾ��ִ��� Ȯ��   �� return boolean
		boolean result = name.contains("11");
		System.out.println(result);
		
					System.out.println("-----------");
		
		//startsWith : �ش繮�ڿ��� �����ϴ��� Ȯ��     �� return boolean
		// endsWith : �ش� ���ڿ��� �������� Ȯ��     �� return boolean
		String data = "hong gil dong";
		System.out.println(data.endsWith("ng"));
		System.out.println(data.endsWith("on"));
		System.out.println(data.startsWith("ho"));
		System.out.println(data.startsWith("g"));
		
		//indexOf : �� ���ڿ� ������ ã�� ���ڿ��� ó�� ��Ÿ���� �ε����� ��ȯ  // -1 : ã������
		System.out.println(data.indexOf("g")); //3��° �ε����� ����
		System.out.println(data.indexOf("g",7)); //7��° �ε������� �����ؼ� (����������) g ã��
		
					System.out.println("-----------");		
		
		//lastIndexOf : �� ���ڿ� ������ ã�� ���ڿ��� ���������� �˻��Ͽ� �ε����� ��ȯ
		System.out.println(data.lastIndexOf("g"));
		System.out.println(data.lastIndexOf("g",4)); //4��°���� �����ؼ� �������� gã��
		
		
					System.out.println("-----------");		
					
		String name1="";
		String name2=null;
		System.out.println(name1==null);
		System.out.println(name2==null);
		
		//isEmpty : ����Ű�� �ִ� ������ �ֳ���?
		System.out.println(name1.isEmpty()); //�� ������ ����Ű�� �־�� 
//		System.out.println(name2.isEmpty()); //null�� ����Ű�°� ����.
		
					System.out.println("-----------replace--------");
					
		//replace : ���ڿ� �ٲ��ֱ�
		data = data.replace("g", "hello"); //������ �����Ҷ����� �׻� �޸𸮸� ���� �������Ƿ� �������־����!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println(data);
		
		
					System.out.println("-----------trim--------");
		
		//trim : �糡 ���� ���� (�߰����� X)
		String data1 = "        hong        gil   dong          ";
		System.out.println(data1.trim());
		
		
	}

}
