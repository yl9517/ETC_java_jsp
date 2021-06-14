package msa11;

public class MemberDTO {
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private float avg;
	
	public MemberDTO() {
		
	}
	public MemberDTO(String name,int kor,int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.tot = kor+eng;
		this.avg = tot/2.0f;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	
	
	
}

