package kr.or.kosta.dto;


public class BoardDTO {
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private String bwritedate;
	private int breadno;
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public String getBwriter() {
		return bwriter;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public String getBwritedate() {
		return bwritedate;
	}
	public void setBwritedate(String bwritedate) {
		this.bwritedate = bwritedate;
	}
	public int getBreadno() {
		return breadno;
	}
	public void setBreadno(int breadno) {
		this.breadno = breadno;
	}
	
	
}
