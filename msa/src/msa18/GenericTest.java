package msa18;

class Man<T>{
	private T[] data;
	private int age;
	int index =0;
	
	public Man(int initalsize) {
		data =(T[]) new Object[initalsize];
	}

	public void add(T o) {
		data[index]=o;
		index++;
	}
	public T get(int i) {
		if(index<=i)
			throw new ArrayIndexOutOfBoundsException();
		return data[i];
	}
	
}
public class GenericTest {

	public static void main(String[] args) {
		Man<String> ins = new Man(10); 
		ins.add("hong");
//		ins.add(10); //내가 String타입으로 지정했기때문에 int타입 오류
	
		System.out.println(ins.get(0));
		System.out.println(ins.get(1));
		System.out.println(ins.get(2));
	
	}

}
