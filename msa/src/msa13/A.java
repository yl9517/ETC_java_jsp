package msa13;

public class A {
/*
 *  Ķ����,String ����� HW -> ref(clone) -> String -> StringBuilder
 * 
 * 
 * ���� ���� : �ּҰ� ����(����) / �ܼ��� �ʵ尪�� �����ؼ� ��ü�� �����ϴ� �� / ������ü�� �����ϸ� ���� ���� ��
 * ���� ���� : Clone �̿��Ͽ� �����ϰ� �ִ� ��ü�� ���� / ��������
 * 
 * 
 *  * [clone] : ��ü����
 *  ��ü������ ������ü�� �ʵ尪�� ������ ���� ������ ���ο� ��ü����
 * 
 * 
 *  * [String] : ������ ���� �ʴ� ���ڿ� (���)
 * 		ex) String name = "hong";
 * 				   name += "kim";   ��  "hong"�޸𸮴� ���ΰ� "hongkim"�� ����Ű�°ɷ� �ٲ�.
 * 								C++������ ������ "hong"�� ���� �� �뷮���� / �޸� ����
 * 	  [garbage collection]	��	java������ ������ "hong" �� ���޸𸮿��� ��� ���ϴ� �޸𸮸� �ֱ������� �˻��ؼ� ����
 *     
 *     �̷��� ���� ������ �ݺ��ϴ� �ͺ��� "hong" �ڿ� ��� ���� �ٴ°��� �� ����
 *     
 * 	String�� ��������
 *  	���۱���� ������ ���ڿ� ǥ��, ������ �ϱ����� ���ڿ� ��ü 
 * 	* [StringBuffer] : ����ȭ ó��  
 * 	* [StringBuilder] : �񵿱�ó�� (�ӵ��� ����.)

 * 
 * 
 * 
 * �Ӱ迪�� (critical section) : �����ڿ�
 * 
 * 
 *  * [compareTo]
 * 
 * 
 */
}