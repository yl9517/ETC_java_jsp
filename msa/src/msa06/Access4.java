package msa06;

class Arr2{
	public void view(String name) {
		System.out.println(name);
	}
	public void view(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}
	
	public void view3(int[] arr) {
		for(int index:arr)
			System.out.println(index);
	}
	
}

public class Access4{
	
	public static void main(String[] args) {
		// hello ��� �������� view ȣ��
		Arr2 arr2 = new Arr2();	
		arr2.view("hello");
		
		//view2 �޼��� ȣ���Ͽ� ȫ�浿 20 ���
		arr2.view("ȫ�浿", 20);
		
		//view�޼��� ȣ�� => 10,30,50 ���
		arr2.view3(new int[] {10,30,50});
		
	}
	
}
