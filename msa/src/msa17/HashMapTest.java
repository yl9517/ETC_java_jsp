package msa17;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		//�߰�
		hm.put("a1", 10);
		hm.put("a2", 20);
		hm.put("a3", 30);
		hm.put("a4", 40);
		
//		System.out.println(hm.keySet());
		
		Iterator<String> ita = hm.keySet().iterator(); //ketset : ����� key(����)���� ��ȯ   //[a1, a2, a3, a4]
		
		while(ita.hasNext()) {
			String key = ita.next();
			int value = hm.get(key); // get :���� Ű�� ���� �� ��ȯ 
			System.out.println(key+" "+value);			
		}

				System.out.println("-----------------------------------");
		
		//����
		int data = hm.remove("a3");
		System.out.println(data+"�� ������!"); // data = "a3"�� ���� ��
		
				System.out.println("-----------------------------------");
		
		ita = hm.keySet().iterator();
		while(ita.hasNext()) {
			String key = ita.next();
			int value = hm.get(key); // get :���� Ű�� ���� �� ��ȯ 
			System.out.println(key+" "+value);			
		}
		

				System.out.println("-----------------------------------");
				
		//�Ȱ��� Ű���� �����ϸ� �������.
		hm.put("a1", 100);
		
		ita = hm.keySet().iterator();
		while(ita.hasNext()) {
			String key = ita.next();
			int value = hm.get(key); // get :���� Ű�� ���� �� ��ȯ 
			System.out.println(key+" "+value);			
		}
	}

}
