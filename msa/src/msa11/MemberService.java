package msa11;

//p280 ����15��
public class MemberService {
	
	public boolean login(String id,String pw) {
		if(id.equals("hong") && pw.equals("12345")) 
			return true;
		
		else 
			return false;
	}
	public void logout(String id) {
		System.out.println(id+"�� �α׾ƿ� �Ǿ����ϴ�");
			
	}
}
