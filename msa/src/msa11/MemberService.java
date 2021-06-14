package msa11;

//p280 문제15번
public class MemberService {
	
	public boolean login(String id,String pw) {
		if(id.equals("hong") && pw.equals("12345")) 
			return true;
		
		else 
			return false;
	}
	public void logout(String id) {
		System.out.println(id+"님 로그아웃 되었습니다");
			
	}
}
