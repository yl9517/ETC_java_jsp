package msa06;

class Student2{
	
	//������	
	Student2(){
		System.out.println("������ -no arguement ������");
	}
	Student2(int su1){
		System.out.println("������ ȣ�� : "+su1);
	}
	Student2(String name){
		System.out.println("������ ȣ�� : "+name);
	}
}
public class ConstructorTest2{

	public static void main(String[] args) {

		Student2 s0 = new Student2();
		Student2 s1 = new Student2(30);
		Student2 s2 = new Student2("hong");
		
		
		
	}
}