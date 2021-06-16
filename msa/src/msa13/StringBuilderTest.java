package msa13;

public class StringBuilderTest {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("abc");
		
		//append : �߰�
		sb.append("hong gil dong");
		sb.append("hello",1,2); //1��°~2-1��°���� �ε��� �߰�
		System.out.println(sb);
				System.out.println("---------");

		StringBuilder sb2 = new StringBuilder("abc");
		System.out.println(sb2.capacity()); //�뷮
		System.out.println(sb2.length());	//����
		
		sb2.append("12345678901234567"); //17���߰�
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());	
		
		
		//delete : ����		
		sb2.delete(2, 5); //2��°���� 5-1��°������ ���� ����
		System.out.println(sb2);
	
		
		//insert : ���ϴ� ��ġ�� ����(�߰�)
		sb2.insert(2, "hello"); //2��° �ε����� hello ����
		System.out.println(sb2);
		
		//reverse : �Ųٷ�
		System.out.println(sb2.reverse());
		
		//trimToSize : length��ŭ���� �뷮(����) ���̱�
		System.out.println(sb2.capacity());
		sb2.trimToSize();
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		
	}
}
