package msa08;

class MemberService{
	String id;
	String pw;
	
	public boolean login(String id,String pw){
		if(id.equals("hong") && pw.equals("12345"))
			return true;
		else
			return false;
	}
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
}
public class P279_15 {

	public static void main(String[] args) {
		
		MemberService m1 = new MemberService();
		
		boolean result = m1.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			m1.logout("hong");
		}
		else {
			System.out.println("id 또는 pw가 올바르지 않습니다.");
		}
		
	}

}
