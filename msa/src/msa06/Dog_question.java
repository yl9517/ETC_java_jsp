package msa06;

/*
 * [����1]
 * 1. Dog Ŭ������ ����� ������� name,type �� ����� (���String)
 * 2. getter,setter,������ ����
 * 3. dog Ŭ���� �̿��Ͽ� dogTestŬ������ �迭ũ�Ⱑ 5�� dog[] �迭 ���� �� dog �ν��Ͻ��� 5�� �����Ͽ� �迭�� �߰�
 * 4. for���� ���� for������ dogŬ������ getter�޼ҵ带 �̿��Ͽ� �߰��� ���� ���
 * 
 * 
 * ��Ʈ) 1. String�� Ŭ������, Ŭ������ �迭�� ����� �ִ�
 * 		2.Ŭ������ ������=null; ������.��¸޼ҵ�(); ��  NullPointerException

 */
class Dog{
	private String name;
	private String type;
	
	public Dog(){
	}
	public Dog(String name,String type){
		this.name = name;
		this.type=type;
	}
	
	//�޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;	
	}
	
	public void setType(String type) {
		this.type=type;
	}
	public String getType() {
		return type;
	}
	
	
}

