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
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
	
}
public class P279_15 {

	public static void main(String[] args) {
		
		MemberService m1 = new MemberService();
		
		boolean result = m1.login("hong", "12345");
		
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			m1.logout("hong");
		}
		else {
			System.out.println("id �Ǵ� pw�� �ùٸ��� �ʽ��ϴ�.");
		}
		
	}

}