package msa11;

public interface Flyable {
	int su=10; //public static final

	void prt();
	
	static void hi() {
		System.out.println("hi");
	}
	
	default void print() { //���� �ִ� �ֵ��� default �ٿ������
	}
}
