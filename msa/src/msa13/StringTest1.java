package msa13;

public class StringTest1 {

	public static void main(String[] args) {
		String name = "hong"; //���ڿ� ���
		String name2 = "hong"; //������ "hong"�̶�� �ϴ� ���ڰ� ������ �¸� ����Ŵ
		String name3 = new String("hong"); //�޸� ���� �Ҵ��ؼ� ���� ����
		
		//== : �޸� ��
		System.out.println(name==name2);  //���� ���� ����Ű�Ƿ� true
		System.out.println(name==name3);  //false
		System.out.println(name.equals(name2)); // true
		System.out.println(name.equals(name3)); //������� �ٸ����� �ڵ� toString�� ���� ���°� ������ ���ٰ� ��������.�ؼ� true
	}

}
