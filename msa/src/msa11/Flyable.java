package msa11;

public interface Flyable {
	int su=10; //public static final

	void prt();
	
	static void hi() {
		System.out.println("hi");
	}
	
	default void print() { //몸통 있는 애들은 default 붙여줘야함
	}
}
