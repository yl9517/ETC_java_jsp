package msa09;

class Final1{
	public void prt() {
		System.out.println("final1 prt method");
	}
}
class SubFinal1 extends Final1{
	@Override  //������ : �θ𿡼� ���ǵ� �޼��带 �ڽ�Ŭ�������� ������
	public void prt() {
		System.out.println("SubFinal1");
	}
}
public class FinalTest1 {

	public static void main(String[] args) {
		
	}

}
