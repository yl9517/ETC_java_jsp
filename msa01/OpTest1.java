package msa01;
//���������

public class OpTest1 {

	public static void main(String[] args) {
		
		int su1 = 10;
		int su2 = 3;
		int sum, sub, mul , re; //��,��,��,������
		float div; //������
		
		sum = su1+su2;
		sub = su1-su2;
		mul = su1*su2;
		div = su1/su2;  // 3.333�� �ȳ����� ������ su1�� su2�� ���ʿ� intŸ���̱� ������ �Ҽ����� ������ ����
		re = su1%su2;	// 10%3 => 1
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(re);
		
		//�Ҽ��� ������
		div = (float)su1/su2; //10.0�� 3���� ���� ��� �Ҽ������� ��� �� //su1,su2 ���߿� �ϳ��� float Ȥ�� doubleŸ������ ���� ����ȯ
		System.out.println("�Ҽ������ ������ : "+div);
		
	}

}
