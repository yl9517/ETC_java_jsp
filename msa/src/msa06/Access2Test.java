package msa06;
/*
 * ĸ��ȭ (private)
 * 
 */
public class Access2Test {
	public static void main(String[] args) {
		Access2 ins = new Access2("ȫ�浿");
		//ins.name="hong"; //name�� private�� ��ü�� name �ν� �ȵ�
		System.out.println(ins.getName()); //�� ���
		
		ins.setName("park");  //�� ����
		System.out.println(ins.getName()); //�� ���
		
	}
}
